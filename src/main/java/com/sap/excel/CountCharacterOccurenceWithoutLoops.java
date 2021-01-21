package com.sap.excel;

public class CountCharacterOccurenceWithoutLoops {

	public static void main(String[] args) {
		String str = "Java is java again and it is java again";

		int count = str.length() - str.replace("a", "").length();
		System.out.println("Number of occurances of 'a' in " + str + " = " + count);

	}

}
