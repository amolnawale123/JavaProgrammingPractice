package com.sap.interview;

import java.util.Scanner;

public class CircularString2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter words separated by space:");
		String input = sc.nextLine();
		System.out.println("Enter position:");
		int index = sc.nextInt();
		// Splitting input string in to string array
		String inputArray[] = input.split(" ");
		int len = inputArray.length;
		// validation for acceptable index
		// index should be grater than or equal to zero and less than length of array
		if (index >= 0 && index < len) {
			System.out.print("Output: ");
			// Printing from given index till last index
			int i = index;
			do{
				
				System.out.print(inputArray[i%len]+" ");
				i++;
				i = i % len;
			}while(i!=index);
			
		} else {
			System.out.println("Index is invalid.");
		}
		sc.close();
	}

}
