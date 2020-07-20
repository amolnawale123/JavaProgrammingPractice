package com.sap.interview;

import java.util.regex.Pattern;

public class CheckStringContainsNumber {

	public static void main(String[] args) {
		//String msg = "What is the square of 123?";
		String msg = "1 1 1 ";
		String regex = "[^a-zA-Z].*\\d.*";
		Pattern pat = Pattern.compile(regex);
		boolean containsNumber = pat.matcher(msg).matches();
		System.out.println("The String Contains only Number? " + containsNumber);

	}

}
