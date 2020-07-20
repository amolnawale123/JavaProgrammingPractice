package com.sap.interview;

public class FactorialWithRecursion {

	public static void main(String[] args) {

		int num = 5;
		int fact = factorial(num);
		System.out.println(fact);
		
	}
	
	public static int factorial(int num) {
		if(num>=1) {
			return num*factorial(num-1);
		}else {
			return 1;
		}
	}

}
