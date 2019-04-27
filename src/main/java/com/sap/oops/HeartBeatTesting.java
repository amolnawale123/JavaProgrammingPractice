package com.sap.oops;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class HeartBeatTesting {

	public static int getResponseCode(String urlString)
			throws MalformedURLException, IOException, InterruptedException {
		System.out.println("The URL is : " + urlString);
		URL u = new URL(urlString);
		HttpURLConnection huc = (HttpURLConnection) u.openConnection();
		HttpURLConnection.setFollowRedirects(false);
		huc.setRequestMethod("GET");
		huc.connect();
		Thread.sleep(10000);
		return huc.getResponseCode();
	}

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {

		Map<String, String> map = new LinkedHashMap<String, String>();
		
		/*List<URLTest> list = new ArrayList<URLTest>();
		int code = getResponseCode("https://llbpal55.pal.sap.corp:14500/portal/");*/
		
		
		
		map.put("AAT_QA", "https://llbpal55.pal.sap.corp:14500/portal/");
		map.put("AAT_DEMO", "https://demo-login.sapdigitalinterconnect.com/portal/");
		map.put("AAT_PROD", "https://login.sapdigitalinterconnect.com/portal/");
		map.put("PC_QA", "https://llbpal55.pal.sap.corp:11200/");
		map.put("PC_DEMO", "https://demo-peopleconnect.sapdigitalinterconnect.com/");
		map.put("PC_PROD", "https://peopleconnect.sapdigitalinterconnect.com/");
		map.put("LLK_QA", "https://llbpal55.pal.sap.corp");
		map.put("LLK_DEMO", "https://demo-livelink.sapdigitalinterconnect.com/");
		map.put("LLK_PROD", "https://livelink.sapdigitalinterconnect.com/");
		

		Map<LinkedHashMap<String,String>, String> newMap = new LinkedHashMap<LinkedHashMap<String,String>, String>();
		
		List<String> list = new ArrayList<String>(map.values());
		System.out.println(list);

		for (Map.Entry<String, String> entry : map.entrySet()) {
			try {
				int code = getResponseCode(entry.getValue());
				if (code == 200) {
					System.out.println("Application " + entry.getKey() + " with URL = " + entry.getValue() + " is Up and Running");
					//newMap.put(entry.getKey(),entry.getValue()), "UP");
					System.out.println();
				} else {
					System.out
							.println("Application " + entry.getKey() + " with URL = " + entry.getValue() + " is DOWN");
					System.out.println();
				}
			} catch (Exception e) {
				System.out.println("******** Unable to Connect to the Application : " + entry.getValue());
				System.out.println();
			}
		}

	}

}
