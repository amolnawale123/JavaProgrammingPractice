package com.sap.interview;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TriangleStar {

	public static void main(String[] args) {
		try {
			BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Enter the number: ");
			int rows = Integer.parseInt(br1.readLine());
			System.out.println("Half Triangle ==>");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j <= i; j++) {
					System.out.print("*");
				}
				System.out.println("");
			}

			System.out.println("Full Triangle ==>");
			for (int i = 0; i < rows; i++) {
				for (int j = 0; j < rows - i; j++) {
					System.out.print(" ");
				}

				for (int k = 0; k <= i; k++) {
					System.out.print("* ");
				}

				System.out.println("");
			}
		} catch (Exception e) {
			System.out.println("Error : " + e);
		}

	}

}
