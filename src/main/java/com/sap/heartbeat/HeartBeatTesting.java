package com.sap.heartbeat;

import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HeartBeatTesting {

	public static List<URLTest> list;
	public static String str = "";
	public static String str1;
	public StringBuilder buf;
	public static TrustManager[] trustAllCerts;
	private static final int MYTHREADS = 30;

	@BeforeMethod
	public void setUp() {
		list = new ArrayList<URLTest>();
		list.add(new URLTest("AAT_QA", "https://llbpal55.pal.sap.corp:14500/portal/", null));
		list.add(new URLTest("AAT_DEMO", "https://demo-login.sapdigitalinterconnect.com/portal/", null));
		list.add(new URLTest("AAT_PROD", "https://login.sapdigitalinterconnect.com/portal/", null));
		list.add(new URLTest("OLD_AAT_PROD", "https://login.sapmobileservices.com", null));
		list.add(new URLTest("PC_QA", "https://llbpal55.pal.sap.corp:11200/", null));
		list.add(new URLTest("PC_DEMO", "https://demo-peopleconnect.sapmobileservices.com/", null));
		list.add(new URLTest("PC_PROD", "https://peopleconnect.sapmobileservices.com/", null));
		list.add(new URLTest("LLK_QA", "https://llbpal55.pal.sap.corp", null));
		list.add(new URLTest("LLK_DEMO", "https://demo-livelink.sapmobileservices.com/", null));
		list.add(new URLTest("LLK_PROD", "https://livelink.sapmobileservices.com/", null));
		list.add(new URLTest("LLK_ADMIN_QA", "https://llbpal55.pal.sap.corp:4040/", null));
		list.add(new URLTest("LLK_ADMIN_DEMO", "https://172.24.227.100:4040/", null));
		list.add(new URLTest("MFA_QA", "https://llbpal57.pal.sap.corp:14100/", null));
		list.add(new URLTest("MFA_DEMO", "https://demo-authentication.sapmobileservices.com/", null));
		list.add(new URLTest("MFA_PROD", "https://authentication.sapmobileservices.com/", null));
	}

	@Test
	public void checkHeartBeat() {
		ExecutorService executor = Executors.newFixedThreadPool(MYTHREADS);
		trustAllCerts = new TrustManager[] { new X509TrustManager() {
			public java.security.cert.X509Certificate[] getAcceptedIssuers() {
				return null;
			}

			public void checkClientTrusted(X509Certificate[] certs, String authType) {
			}

			public void checkServerTrusted(X509Certificate[] certs, String authType) {
			}
		} };

		for (int i = 0; i < list.size(); i++) {

			String url = list.get(i).getUrl();
			Runnable worker = new MyRunnable(url);
			executor.execute(worker);
		}
		executor.shutdown();

		// Wait until all threads are finish
		while (!executor.isTerminated()) {

		}
		System.out.println("\nFinished all threads");

		for (int i = 0; i < list.size(); i++) {
			try {
				int code = TestUtil.getResponseCode(list.get(i).getUrl());
				if (code == 200) {
					list.get(i).setStatus("UP");
					System.out.println("Application " + list.get(i).getAppName() + " with URL = " + list.get(i).getUrl()
							+ " is Up and Running");
					System.out.println();
				} else {
					System.out.println("Application " + list.get(i).getAppName() + " with URL = " + list.get(i).getUrl()
							+ " is DOWN");
					System.out.println();
					list.get(i).setStatus("DOWN");

				}
			} catch (Exception e) {
				System.out.println(" Unable to Connect to the Application : " + list.get(i).getUrl());
				System.out.println();
				list.get(i).setStatus("Connection Refused");
				e.printStackTrace();
			}
		}

		for (URLTest urlTest : list) {
			System.out.println(urlTest.getAppName() + " - " + urlTest.getUrl() + " - " + urlTest.getStatus());
		}
		str1 = getString();
	}

	public String getString() {
		buf = new StringBuilder();
		buf.append("<html>" + "<meta charset='UTF-8'" + "<head>" + "<style>"
				+ "table{border-collapse: collapse;font-family:arial;}" + "</style>" + "</head>" + "<body>"
				+ "<table border='1' bordercolor=BLACK>" + "<tr bgcolor='#85adad'>" + "<th>App Name</th>"
				+ "<th>URL</th>" + "<th>Status</th>" + "</tr>");
		for (int i = 0; i < list.size(); i++) {
			buf.append("<tr><td>").append(list.get(i).getAppName()).append("</td><td>").append(list.get(i).getUrl())
					.append("</td><td>").append(list.get(i).getStatus()).append("</td></tr>");
		}
		buf.append("</table>" + "</body>" + "</html>");
		String str = buf.toString();
		System.out.println(str);
		return str;
	}

	/*
	 * @AfterMethod public void sendEmail() { try { SendEmailReport.sendEmail(); }
	 * catch (MalformedURLException | EmailException e) { // TODO Auto-generated
	 * catch block e.printStackTrace(); } }
	 */

}
