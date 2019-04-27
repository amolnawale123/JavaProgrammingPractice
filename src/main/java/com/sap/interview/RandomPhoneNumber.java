package com.sap.interview;

public class RandomPhoneNumber {

	public static void main(String[] args) {
		long num = (long) Math.floor(Math.random() * 9_000_000_000L) + 1_000_000_000L;
		System.out.println("The Random Phone Number is: " + num);
		String number = String.valueOf(num);
		System.out.println(number);
	}

}
