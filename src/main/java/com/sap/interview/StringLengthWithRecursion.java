package com.sap.interview;

public class StringLengthWithRecursion {

	static int recLen(String str) {

		if (str.equals("")) {
			return 0;
		} else {
			return recLen(str.substring(1)) + 1;
		}

	}

	public static void main(String[] args) {

		String str = "Hello World how r u";
		System.out.println("Length of the String is = "+ recLen(str));
	}

}
