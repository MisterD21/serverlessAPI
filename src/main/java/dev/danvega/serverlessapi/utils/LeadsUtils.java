package dev.danvega.serverlessapi.utils;

import org.springframework.stereotype.Component;

import com.mongodb.client.model.Filters;

import dev.danvega.serverlessapi.constants.LeadsConstants;

import org.bson.conversions.Bson;

@Component
public class LeadsUtils {

	public Bson getEmailFilter() {
		return Filters.or(
                Filters.ne(LeadsConstants.WORK_EMAIL, null),
                Filters.elemMatch(LeadsConstants.EMAILS, Filters.ne(LeadsConstants.ADDRESS, null))
        );
	}
}
