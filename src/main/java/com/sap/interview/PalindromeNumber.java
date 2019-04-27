package com.sap.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class PalindromeNumber {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the Number:");
			int num = Integer.parseInt(br.readLine());
			int n = num;
			System.out.println("The original number is :" + num);
			int rev = 0;
			while (num != 0) {
				rev = rev * 10 + num % 10;
				num = num / 10;
			}
			System.out.println("The Reversed number is :" + rev);

			if (n == rev) {
				System.out.println("The entered number is a Palindrome");
			} else {
				System.out.println("The entered number is NOT a Palindrome");
			}

		} catch (Exception e) {
			System.out.println("Out of range!");
		}

	}

}
