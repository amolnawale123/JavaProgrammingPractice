package com.sap.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ListPrimeNumbers {

	public static void main(String[] args) {
		int i;
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number:");
			int num = Integer.parseInt(br.readLine());
			System.out.println("Prime numbers: ");
			for (i = 1; i < num; i++) {
				int j;
				for (j = 2; j < i; j++) {
					int n = i % j;
					if (n == 0) {
						break;
					}
				}
				if (i == j) {
					System.out.println(i);
				}

			}
			
		} catch (Exception e) {

		}

	}

}
