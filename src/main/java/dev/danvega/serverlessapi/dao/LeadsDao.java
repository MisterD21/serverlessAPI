package dev.danvega.serverlessapi.dao;

import org.bson.Document;

import com.mongodb.client.FindIterable;

public interface LeadsDao {

	FindIterable<Document> getRecordsCotainingEmails(int limit, int skip);

}
