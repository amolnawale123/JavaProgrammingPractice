package com.sap.interview;

public class PowerOfNumber {

	public static void main(String[] args) {

		int base = 3;
		int exp = 4;
		long result=1;
		
		while(exp !=0) {
			result*=base;
			exp--;
		}
		
		System.out.println(result);
		
		//System.out.println(Math.pow(base, exp));
		
	}

}
