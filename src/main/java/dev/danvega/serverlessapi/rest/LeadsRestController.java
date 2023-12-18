package dev.danvega.serverlessapi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import dev.danvega.serverlessapi.services.LeadsService;

@RestController
@RequestMapping("/api")
public class LeadsRestController {
	
	@Autowired
	private LeadsService leadsService;

	@GetMapping("/leads")
	public ResponseEntity<String> getAllLeads(@RequestParam(name = "limit") int limit, @RequestParam(name = "skip") int skip){
		try {
			return leadsService.getAllLeads(limit,skip);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return new ResponseEntity<String>("Something went wrong",HttpStatus.INTERNAL_SERVER_ERROR);
	}
	
}
