package com.letzautomate.restservicesutilities;

import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.HashMap;

import org.json.simple.JSONObject;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class CRUDOperations {
	
	
	//parameters
	public static Response sendGETRequest(String params){
		
		HashMap<String, String> params1 = ParametersMap.getParams(params);
		
		String endPoint = params1.get("ENDPOINT");
		String queryParamName = params1.get("paramName");
		String queryParamValue = params1.get("paramValue");
		
		RequestSpecification requestSpec = RequestSpecUtils.getRequestSpecificationWithAuth();
		RequestSpecUtils.addQueryParams(requestSpec, queryParamName, queryParamValue);
		
		Response response = 
					given()
						.spec(requestSpec).
					when()
						.get(endPoint).
					then()
						.spec(ResponseSpecUtils.getResponseSpec()).extract().response();
		return response;
	}
	
	public static Response sendPOSTRequest(String params){
		
		HashMap<String, String> params1 = ParametersMap.getParams(params);
		
		String endPoint = params1.get("ENDPOINT");
		String payLoadPath = params1.get("payLoadPath");
		File payLoad = new File(payLoadPath);
		
		RequestSpecification requestSpec = RequestSpecUtils.getRequestSpecificationWithAuth();
				
		Response response = 
					given()
						.spec(requestSpec)
						.with().body(payLoad).
					when()
						.post(endPoint).
					then()
						.spec(ResponseSpecUtils.getResponseSpec()).extract().response();
		return response;
	}
	
	public static Response sendPostRequestWithJsonObject(String params){
		
		HashMap<String, String> params1 = ParametersMap.getParams(params);
		
		String endPoint = params1.get("ENDPOINT");
		JSONObject jsonObject = PayloadUtilities.buildJSONObject();
		RequestSpecification requestSpec = RequestSpecUtils.getRequestSpecificationNoAuth();
				
		Response response = 
					given()
						.spec(requestSpec)
						.with().body(jsonObject.toJSONString()).
					when()
						.post(endPoint).
					then()
						.spec(ResponseSpecUtils.getResponseSpec()).extract().response();
		return response;
		
	}
	
public static Response sendPOSTRequestNoAuth(String params){
		
		HashMap<String, String> params1 = ParametersMap.getParams(params);
		
		String endPoint = params1.get("ENDPOINT");
		String payLoadPath = params1.get("payLoadPath");
		File payLoad = new File(payLoadPath);
		
		RequestSpecification requestSpec = RequestSpecUtils.getRequestSpecificationNoAuth();
				
		Response response = 
					given()
						.spec(requestSpec)
						.with().body(payLoad).
					when()
						.post(endPoint).
					then()
						.spec(ResponseSpecUtils.getResponseSpec()).extract().response();
		return response;
	
	}

}
