package com.sap.interview;

public class SwapTwoNumbers {

	public static void main(String[] args) {
		int x = 45;
		int y = 20;
		System.out.println("Before Swapping:");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
		x = x + y;
		y = x - y;
		x = x - y;
		System.out.println("After Swapping:");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}

}
