package com.sap.interview;

public class ReverseInteger {

	public static void main(String[] args) {
		int num = 12345;
		int rev = 0;

		// Using while loop
		while (num != 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;
		}

		System.out.println(rev);
		
		// Using StringBuffer
		long num1 = 98238057;
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());

	}

}
