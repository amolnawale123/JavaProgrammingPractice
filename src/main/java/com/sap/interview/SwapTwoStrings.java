package com.sap.interview;

public class SwapTwoStrings {

	public static void main(String[] args) {
		String a = "Hello";
		String b = "World";
		System.out.println("Before Swapping");
		System.out.println("String a = "+a);
		System.out.println("String b = "+b);
		
		a=a+b;
		b=a.substring(0, a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("After Swapping");
		System.out.println("String a = "+a);
		System.out.println("String b = "+b);

	}

}
