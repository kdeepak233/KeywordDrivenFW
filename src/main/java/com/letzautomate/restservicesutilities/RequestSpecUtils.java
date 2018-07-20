package com.letzautomate.restservicesutilities;

import java.util.HashMap;

//import com.letzautomate..ServiceConstants;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

public class RequestSpecUtils {
	
	public static RequestSpecification getRequestSpecificationWithAuth(){
		
		RequestSpecBuilder requestBuilder = new RequestSpecBuilder();
		requestBuilder.setBaseUri(ServiceConstants.BASEURI);
		requestBuilder.setBasePath(ServiceConstants.BASEPATH);
		requestBuilder.setContentType("application/json");
		requestBuilder.setAuth(AuthorizationUtils.getOAuthScheme());
		return requestBuilder.build();
	}
	
public static RequestSpecification getRequestSpecificationNoAuth(){
		
		RequestSpecBuilder requestBuilder = new RequestSpecBuilder();
		requestBuilder.setBaseUri(ServiceConstants.BASEURI);
		requestBuilder.setBasePath(ServiceConstants.BASEPATH);
		requestBuilder.setContentType("application/json");
		return requestBuilder.build();
	}
	
	 
	
	public static RequestSpecification addQueryParams(RequestSpecification requestSpec, String key, String value){
		return requestSpec.queryParam(key, value);
	}
	
	public static RequestSpecification addQueryParams(RequestSpecification requestSpec, HashMap<String, String> params){
		return requestSpec.queryParams(params);
	}

}
