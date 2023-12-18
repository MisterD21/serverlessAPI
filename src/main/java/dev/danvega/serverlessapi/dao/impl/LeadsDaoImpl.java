package dev.danvega.serverlessapi.dao.impl;

import org.bson.Document;
import org.bson.conversions.Bson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import dev.danvega.serverlessapi.constants.LeadsConstants;
import dev.danvega.serverlessapi.dao.LeadsDao;
import dev.danvega.serverlessapi.utils.LeadsUtils;

@Repository
public class LeadsDaoImpl implements LeadsDao {
	
	@Autowired
	private LeadsConstants constants;
	
	@Autowired
	private LeadsUtils leadsUtils;

	@Override
	public FindIterable<Document> getRecordsCotainingEmails(int limit, int skip) {
		String connectionString = constants.connectionString;
		MongoClientSettings settings = MongoClientSettings.builder()
		        .applyConnectionString(new ConnectionString(connectionString))
		        .build();

		    try {
		    	MongoClient mongoClient = MongoClients.create(settings);
		        // Send a ping to confirm a successful connection
		        MongoDatabase database = mongoClient.getDatabase(constants.dbName);
		        MongoCollection<Document> collection = database.getCollection(constants.collName);
		        
		        Bson emailFilter = leadsUtils.getEmailFilter();
		        
		        return collection.find(emailFilter).skip(limit*skip).limit(limit);
		       
		       
		    } catch (MongoException e) {
		        e.printStackTrace();
		    }
		return null;
	}

}
