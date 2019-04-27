package com.sap.interview;

import java.util.Scanner;

public class BiggerNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number ");
		int a = sc.nextInt();
		System.out.println("Enter second number ");
		int b = sc.nextInt();

		if ((a > b) && ((a - b) >= 2)) {
			System.out.println(a);
		} else if ((b > a) && ((b - a) >= 2)) {
			System.out.println(b);
		} else {
			System.out.println("INCONCLUSIVE");
		}

		sc.close();

	}

}
