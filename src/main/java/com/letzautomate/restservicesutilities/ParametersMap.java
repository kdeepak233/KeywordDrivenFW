package com.letzautomate.restservicesutilities;

import java.util.HashMap;

public class ParametersMap {
	
	public static HashMap<String, String> getParams(String params){
		
		HashMap<String, String> params1 = new HashMap<String, String>();
		String[] mapsArray = params.split("\\|" , -1);
		for(String m: mapsArray){
			String[] keyValuePairArray = m.split("=", -1);
			params1.put(keyValuePairArray[0], keyValuePairArray[1]);
		}
		return params1;
		
	}

}
