package com.sap.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PrimeNumber {

	public static void main(String[] args) {
		int i;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number:");
			int num = Integer.parseInt(br.readLine());
			for (i = 2; i < num; i++) {
				int n = num % i;
				if (n == 0) {
					System.out.println("not Prime!");
					break;
				}
			}
			if (i == num) {
				System.out.println("Prime number!");
			}
		} catch (Exception e) {

		}
	}

}
