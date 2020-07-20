package com.sap.interview;

public class ExtractNumberFromString {

	public static void main(String[] args) {
		String msg = "My age is 21 23 45 56";
		msg=msg.replaceAll("[^0-9]", "");
		System.out.println(msg);
	}

}
