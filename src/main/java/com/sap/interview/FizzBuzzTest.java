package com.sap.interview;

import java.util.Scanner;

public class FizzBuzzTest {
	public static void main(String args[]) throws Exception {
		// Write your code here
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number greater than 0");
		int number = sc.nextInt();
		for (int i = 0; i <= number; i++) {
			if (i % 15 == 0) {
				System.out.println("fizzbuzz");
			} else if (i % 5 == 0) {
				System.out.println("fizz");
			} else if (i % 3 == 0) {
				System.out.println("buzz");
			} else {
				System.out.println(i);
			}
		}
		sc.close();

	}

}