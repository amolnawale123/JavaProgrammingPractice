package com.sap.interview;

import java.net.MalformedURLException;
import java.net.URL;

public class HostNameofURL {

	public static void main(String[] args) throws MalformedURLException {

		URL url = new URL("https://demo-peopleconnect.sapmobileservices.com");
		String hostName = url.getHost();
		int port = url.getPort();
		System.out.println("The Hostname is : "+hostName);
		System.out.println("The port number is : "+port);

	}

}
