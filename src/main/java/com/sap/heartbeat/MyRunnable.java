package com.sap.heartbeat;

import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

public class MyRunnable implements Runnable {
	private final String url;

	MyRunnable(String url) {
		this.url = url;
	}

	public void run() {

		String result = "";
		int code = 200;
		try {
			URL siteURL = new URL(url);
			HttpsURLConnection connection = (HttpsURLConnection) siteURL.openConnection();
			HttpsURLConnection.setFollowRedirects(false);
			SSLContext sc = null;
			try {
				sc = SSLContext.getInstance("SSL");
			} catch (NoSuchAlgorithmException e1) {
				e1.printStackTrace();
			}
			try {
				sc.init(null, HeartBeatTesting.trustAllCerts, new java.security.SecureRandom());
			} catch (KeyManagementException e) {
				e.printStackTrace();
			}
			HttpsURLConnection.setDefaultSSLSocketFactory(sc.getSocketFactory());
			connection.setRequestMethod("GET");
			connection.setConnectTimeout(3000);
			connection.connect();

			code = connection.getResponseCode();
			if (code == 200) {
				result = "-> Green <-\t" + "Code: " + code;				
			} else {
				result = "-> Yellow <-\t" + "Code: " + code;
			}
		} catch (Exception e) {
			result = "-> Red <-\t" + "Wrong domain - Exception: " + e.getMessage();

		}
		System.out.println(url + "\t\tStatus:" + result);
	}
}
