package com.sap.interview;

import java.util.Scanner;

public class RemoveVowelsFromString {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String");
		String str = sc.nextLine();
		String inputString = str.replaceAll("[AEIOUaeiou]", "");
		System.out.println("The String without vowels is : ");
		System.out.println(inputString);
		sc.close();
	}

}
