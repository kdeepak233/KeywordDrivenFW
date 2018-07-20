package com.letzautomate.restservicesutilities;

import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.specification.ResponseSpecification;

public class ResponseSpecUtils {
	
	public static ResponseSpecification getResponseSpec(){
	
		ResponseSpecBuilder responseBuilder = new ResponseSpecBuilder();
		responseBuilder.expectStatusCode(200);
		return responseBuilder.build();
		
		
	}
	
	

}
