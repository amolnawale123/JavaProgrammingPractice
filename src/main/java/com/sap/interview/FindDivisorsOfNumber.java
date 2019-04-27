package com.sap.interview;

import java.util.Scanner;

public class FindDivisorsOfNumber {

	static void findAndPrintDivisors(int n) {
		for (int i = 1; i <= n; i++)
			if (n % i == 0)
				System.out.printf("%d ", i);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number greater than 0");
		int num = sc.nextInt();
		System.out.println("The divisors of the number " + num + " are:");
		findAndPrintDivisors(num);
		sc.close();
	}
}
