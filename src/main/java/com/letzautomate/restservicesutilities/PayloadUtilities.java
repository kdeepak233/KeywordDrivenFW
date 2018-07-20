package com.letzautomate.restservicesutilities;

import org.json.simple.JSONObject;

public class PayloadUtilities {
	
	public static JSONObject buildJSONObject(){
		JSONObject requestParams = new JSONObject();
		requestParams.put("author", "Ramakrishna"); // Cast
		requestParams.put("created", "2018-07-01T20:04:48.958");
		requestParams.put("message", "HelloRamakrishna");
		return requestParams;
	}
	
	

}
