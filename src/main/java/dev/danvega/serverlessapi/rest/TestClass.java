package dev.danvega.serverlessapi.rest;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;

import com.mongodb.ConnectionString;
import com.mongodb.MongoClientSettings;
import com.mongodb.MongoException;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

public class TestClass {
	
	public static void main(String[] args) {
		/*
		String connectionString = "mongodb+srv://root:root@nandan.axfxcb8.mongodb.net/?retryWrites=true&w=majority";
        ServerApi serverApi = ServerApi.builder()
                .version(ServerApiVersion.V1)
                .build();
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                // Send a ping to confirm a successful connection
                MongoDatabase database = mongoClient.getDatabase("cafe_management");
                MongoCollection<Document> collection = database.getCollection("category");
                FindIterable<Document> documents = collection.find();

                // Iterate over the documents and print the content
                for (Document document : documents) {
                    System.out.println(document.toJson());
                }
                System.out.println("Pinged your deployment. You successfully connected to MongoDB!");
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }
        */
		
		
		/*

		String connectionString = "mongodb://mongo:tSn2fgaDW1i3BiDOWoPG@containers-us-west-170.railway.app:5628";
		ServerApi serverApi = ServerApi.builder()
		        .version(ServerApiVersion.V1)
		        .strict(true)
		        .deprecationErrors(true)
		        .build();
        MongoClientSettings settings = MongoClientSettings.builder()
                .applyConnectionString(new ConnectionString(connectionString))
                .serverApi(serverApi)
                .build();
        // Create a new client and connect to the server
        try (MongoClient mongoClient = MongoClients.create(settings)) {
            try {
                // Send a ping to confirm a successful connection
                MongoDatabase database = mongoClient.getDatabase("prolead");
                MongoCollection<Document> collection = database.getCollection("leads");
                String objectIdString = "652d16bcb80f3702bfa96583";
                org.bson.types.ObjectId objectId = new org.bson.types.ObjectId(objectIdString);
                org.bson.conversions.Bson filter = Filters.eq("_id", objectId);

                FindIterable<Document> findIterable = collection.find(filter);
                

                // Iterate over the documents and print the content
                for (Document document : findIterable) {
                    System.out.println(document.toJson());
                }
                //System.out.println(findIterable.);
            } catch (MongoException e) {
                e.printStackTrace();
            }
        }
            */
		
		
		String connectionString = "mongodb://mongo:tSn2fgaDW1i3BiDOWoPG@containers-us-west-170.railway.app:5628";
		MongoClientSettings settings = MongoClientSettings.builder()
		        .applyConnectionString(new ConnectionString(connectionString))
		        .build();

		try (MongoClient mongoClient = MongoClients.create(settings)) {
		    try {
		        // Send a ping to confirm a successful connection
		        MongoDatabase database = mongoClient.getDatabase("prolead");
		        MongoCollection<Document> collection = database.getCollection("leads");
		        
		        FindIterable<Document> findIterable = collection.find().limit(10);
		        //JsonWriterSettings jsonWriterSettings = JsonWriterSettings.builder().outputMode(JsonWriterSettings.OutputMode.RELAXED).build();
		        List<String> list = new ArrayList<String>();
	            System.out.println("=========================");
		        // Iterate over the documents and print the content
		        for (Document document : findIterable) {
		        	System.out.println("=========================");
		            //System.out.println(document.toJson());
		            list.add(document.toJson());
		            System.out.println(list);
		        	System.out.println("=========================");
//		            System.out.println(document.getString("full_name"));
		        }
		    } catch (MongoException e) {
		        e.printStackTrace();
		    }
		}

	}

}
