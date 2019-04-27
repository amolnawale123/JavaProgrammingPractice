package com.sap.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Number:");
			int num = Integer.parseInt(br.readLine());
			long fact = 1;
			System.out.println("Factorial of " + num + " is: ");
			for (int i = 1; i <= num; i++) {
				fact = fact * i;
			}
			System.out.println(fact);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
