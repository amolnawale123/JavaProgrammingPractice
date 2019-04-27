package com.sap.interview;

public class MethodOverloadingConcept {

	public static int x, y, z;

	public static void main(String[] args) {
		System.out.println("Inside Main Method");
		add(2,3);
	}

	public static void add(int a, int b) {
		z = a + b;
		System.out.println("Value of z = " + z);
	}
	
	public static int add(int a,int b, int c) {
		return c;
		
	}

}
