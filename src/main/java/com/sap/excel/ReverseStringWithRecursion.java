package com.sap.excel;

public class ReverseStringWithRecursion {

	static String reverseSTringRecursion(String str) {
		if((null == str) || (str.length()<=1)) {
			return str;
		}
		
		return reverseSTringRecursion(str.substring(1))+str.charAt(0);
	}
	public static void main(String[] args) {

		System.out.println(reverseSTringRecursion("Amol"));
		System.out.println(reverseSTringRecursion("Australia"));

	}

}
