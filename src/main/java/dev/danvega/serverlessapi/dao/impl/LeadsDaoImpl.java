package dev.danvega.serverlessapi.dao.impl;

import org.bson.Document;
import org.springframework.stereotype.Repository;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.model.Filters;

import dev.danvega.serverlessapi.dao.LeadsDao;

@Repository
public class LeadsDaoImpl implements LeadsDao {

	@Override
	public FindIterable<Document> getRecordsCotainingEmails(int limit, int skip) {
		String connectionString = "your connection string";
		MongoClientSettings settings = MongoClientSettings.builder()
		        .applyConnectionString(new ConnectionString(connectionString))
		        .build();

		    try {
		    	MongoClient mongoClient = MongoClients.create(settings);
		        // Send a ping to confirm a successful connection
		        MongoDatabase database = mongoClient.getDatabase("prolead");
		        MongoCollection<Document> collection = database.getCollection("leads");
		        
		        org.bson.conversions.Bson filter = Filters.or(
	                    Filters.ne("work_email", null),
	                    Filters.elemMatch("emails", Filters.ne("address", null))
	            );
		        return collection.find(filter).skip(limit*skip).limit(limit);
		       
		       
		    } catch (MongoException e) {
		        e.printStackTrace();
		    }
		return null;
	}

}
