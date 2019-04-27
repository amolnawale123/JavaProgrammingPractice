package com.sap.heartbeat;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.security.KeyManagementException;
import java.security.NoSuchAlgorithmException;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLContext;

public class TestUtil {
	public static int getResponseCode(String urlString)
			throws MalformedURLException, IOException, InterruptedException {
		System.out.println("The URL is : " + urlString);
		URL u = new URL(urlString);
		HttpsURLConnection huc = (HttpsURLConnection) u.openConnection();
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
		huc.setRequestMethod("GET");
		huc.setConnectTimeout(3000);
		huc.connect();
		return huc.getResponseCode();
	}
}
