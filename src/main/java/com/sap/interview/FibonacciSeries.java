package com.sap.interview;

import java.util.ArrayList;
import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {

		ArrayList<Integer> series = new ArrayList<>();
		series.add(0);
		series.add(1);

		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the length of the Fibonacci Series: ");
		int length = sc.nextInt();

		sc.close();

		if (length <= 0) {
			System.out.println("Length cannot be zero or negative");
		} else if (length == 1) {
			System.out.println(series.get(0));
		} else if (length == 2) {
			System.out.println(series);
		} else {

			for (int i = 3; i <= length; i++) {
				series.add(series.get(i - 2) + series.get(i - 3));
			}
			System.out.println("The Fibonacci Series of length "+length+" is as below :");
			System.out.println(series);

		}

	}

}
