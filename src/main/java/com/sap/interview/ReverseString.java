package com.sap.interview;

public class ReverseString {

	public static void main(String[] args) {
		String s = "Hello World";
		String s1 = "My Bad";
		int len = s.length();
		String rev = "";

		// Using for loop
		for (int i = len - 1; i >= 0; i--) {
			rev = rev + s.charAt(i);
		}
		System.out.println(rev);
		
		// Using StringBuffer class
		StringBuffer sf = new StringBuffer(s1);
		System.out.println(sf.reverse());

	}

}
