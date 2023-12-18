package dev.danvega.serverlessapi.constants;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class LeadsConstants {

	public static final String WORK_EMAIL="work_email";
	public static final String EMAILS="emails";
	public static final String ADDRESS="address";
	
	@Value("${com.mongodb.connectionString.url}")
    public String connectionString;
	
	@Value("${com.mongodb.db.name}")
    public String dbName;
	
	@Value("${com.mongodb.coll.name}")
    public String collName;
}
