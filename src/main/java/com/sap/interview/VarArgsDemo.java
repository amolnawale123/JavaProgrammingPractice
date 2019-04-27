package com.sap.interview;

public class VarArgsDemo {

	static double average(int ... a) {
		// Average of n numbers
		int n = a.length;
		int sum = 0;
		// Calculating sum of numbers
		for(int i:a) {
			sum=sum+i;
		}
		System.out.println(sum);
		return (sum/n);
	}
	public static void main(String[] args) {
		System.out.println(average(10,15,20));
		System.out.println(average(10,15,20,24,30,36,40,43));
	}

}
