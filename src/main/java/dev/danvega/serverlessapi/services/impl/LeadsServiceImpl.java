package dev.danvega.serverlessapi.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.mongodb.client.FindIterable;

import dev.danvega.serverlessapi.dao.LeadsDao;
import dev.danvega.serverlessapi.services.LeadsService;

@Service
public class LeadsServiceImpl implements LeadsService {
	
	@Autowired
	private LeadsDao leadsDao;

	@Override
	public ResponseEntity<String> getAllLeads(int limit, int skip) {
		
		try {
			List<String> list = new ArrayList<String>();
			FindIterable<Document> findIterable = leadsDao.getRecordsCotainingEmails(limit,skip);
			for (Document document : findIterable) {
	            list.add(document.toJson().toString());
	        }
	        return new ResponseEntity<String>(list.toString(),HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return new ResponseEntity<String>("",HttpStatus.INTERNAL_SERVER_ERROR);
	}

}
