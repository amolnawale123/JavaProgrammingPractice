package com.sap.interview;

public class CheckStringContainsDigit {

	public static final boolean containsDigit(String msg) {
		boolean containsDigit = false;

		if (msg != null && !msg.isEmpty()) {
			char[] ch = msg.toCharArray();
			for (char c : ch) {
				if (containsDigit = Character.isDigit(c)) {
					break;
				}
			}
		}
		System.out.println(containsDigit);
		return containsDigit;
	}

	public static void main(String[] args) {
		String str = "What is the square of 1234?";
		containsDigit(str);
	}

}
