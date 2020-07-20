package com.sap.interview;

public class ModifyString {

	public static void main(String[] args) {
		String str = "https://demo-peopleconnect.sapmobileservices.com/api";
		str = str.replaceAll("/api", "");
		System.out.println(str);
	}

}
