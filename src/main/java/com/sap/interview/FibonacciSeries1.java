package com.sap.interview;

import java.util.Scanner;

public class FibonacciSeries1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of the series, greater than 0");
		int num = sc.nextInt();
		int a = 0, b = 0, c = 1;
		if (num <= 0) {
			System.out.println("you have not entered the length > 0");
		} else {
			for (int i = 0; i < num; i++) {
				a = b;
				b = c;
				c = a + b;
				System.out.print(a + " ");
			}
		}
		sc.close();
	}

}
