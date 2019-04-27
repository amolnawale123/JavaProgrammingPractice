package com.sap.selenium;



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
		Thread.sleep(5000);
		return huc.getResponseCode();
	}

	public static void main(String[] args) throws MalformedURLException, IOException, InterruptedException {

		List<URLTest> list = new ArrayList<URLTest>();
		
			list.add(new URLTest("AAT_QA" , "https://llbpal55.pal.sap.corp:14500/portal/", null));
			list.add(new URLTest("AAT_DEMO", "https://demo-login.sapdigitalinterconnect.com/portal/", null));
			list.add(new URLTest("AAT_PROD", "https://login.sapdigitalinterconnect.com/portal/", null));
			list.add(new URLTest("PC_DEMO", "https://demo-peopleconnect.sapdigitalinterconnect.com/", null));
			list.add(new URLTest("PC_PROD", "https://peopleconnect.sapdigitalinterconnect.com/", null));
			list.add(new URLTest("LLK_QA", "https://llbpal55.pal.sap.corp", null));
			list.add(new URLTest("LLK_DEMO", "https://demo-livelink.sapdigitalinterconnect.com/", null));
			list.add(new URLTest("LLK_PROD", "https://livelink.sapdigitalinterconnect.com/", null));

		for (int i =0; i<list.size() ; i++) {
			try {
				int code = getResponseCode(list.get(i).getUrl());
				if (code == 200) {
					list.get(i).setStatus("UP");
					System.out.println(
							"Application " + list.get(i).getAppName() + " with URL = " + list.get(i).getUrl() + " is Up and Running");
					System.out.println();
				} else {
					System.out
							.println("Application " + list.get(i).getAppName() + " with URL = " + list.get(i).getUrl() + " is DOWN");
					System.out.println();
					list.get(i).setStatus("DOWN");

				}
			} catch (Exception e) {
				System.out.println("******** Unable to Connect to the Application : " + list.get(i).getUrl());
				System.out.println();
			}
		}
		

		for(URLTest urlTest : list) {
			System.out.println(urlTest.getUrl() + "    " + urlTest.getStatus());
		}
	}

}

