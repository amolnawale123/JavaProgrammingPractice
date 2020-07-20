package com.sap.interview;

public class StringComparision {

	public static void main(String[] args) {
		String s1 = "Java";
		StringBuilder s2 = new StringBuilder("Java");
		System.out.println(s1.equals(s2));
		String s3 = new String("Java");
		
		System.out.println(s3.equals(s2));
		System.out.println(s1.equals(s3));
	}

}
