package dev.danvega.serverlessapi.services;

import org.springframework.http.ResponseEntity;

public interface LeadsService {

	ResponseEntity<String> getAllLeads(int limit, int skip);
}
