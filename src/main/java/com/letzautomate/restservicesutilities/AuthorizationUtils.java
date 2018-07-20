package com.letzautomate.restservicesutilities;

//import com.letzautomate.constants.ServiceConstants;

import io.restassured.RestAssured;
import io.restassured.authentication.AuthenticationScheme;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.specification.RequestSpecification;

	public class AuthorizationUtils {
		public static String CONSUMERKEY = "ErVy9T5IW5SeuWTBN3eZQv290";
		public static String CONSUMERSECRET = "JuoXc3JefhQmosVT2kAcmJU2KyWM4rHCOQb91E2KVRdSObFg5R";
		public static String ACCESSTOKEN = "1008268275153883136-jKQjAsTHCsAPvH0d6iIyprhwEuKTA8";
		public static String ACCESSTOKENSECRET = "Uh7InkYB3UkyKBn6c7987BJk2dVU1bkcLY1Myj70dPaHv";
		public static AuthenticationScheme getOAuthScheme(){
			return RestAssured.oauth(CONSUMERKEY, CONSUMERSECRET, ACCESSTOKEN,  ACCESSTOKENSECRET);
		}
	public static RequestSpecification getBasicAuth(RequestSpecBuilder reqBuilder, String authString){
		return reqBuilder.addHeader("Authorization", "Basic " + authString).build();
	}
	
	
	
	

}