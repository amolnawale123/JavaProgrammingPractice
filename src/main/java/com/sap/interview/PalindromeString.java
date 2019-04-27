package com.sap.interview;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);
			System.out.println("Please enter the String");
			String str = sc.nextLine();
			StringBuilder sb = new StringBuilder(str);
			System.out.println("Original String : "+sb.toString());
			StringBuilder sbRev = sb.reverse();
			System.out.println("Reversed String : "+sbRev.toString());

			if ((sb.toString())==(sbRev.toString())) {
				System.out.println("The String " + str + " is a Palindrome");
			} else {
				System.out.println("The String " + str + " is a NOT Palindrome");
			}

			sc.close();

		} catch (Exception e) {
			System.out.println("Out of range!");
		}

	}

}
