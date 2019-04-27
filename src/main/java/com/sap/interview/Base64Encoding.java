package com.sap.interview;

import java.util.Base64;

public class Base64Encoding {

	
	public static void main(String[] args) {
		String appCode="u44WtGQlwAIn5DUI";
		String appSecret="AbnHMz59rNgM0aibtAclY3qW2hoHZwdp";
		String appCodeSecret = appCode+":"+appSecret;
		String encodedString = new String(Base64.getEncoder().encodeToString(appCodeSecret.toString().getBytes()));
		System.out.println(encodedString);

	}

}
