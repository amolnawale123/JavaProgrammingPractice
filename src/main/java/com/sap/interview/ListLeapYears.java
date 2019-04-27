package com.sap.interview;

public class ListLeapYears {

	public static void main(String[] args) {
		{
			int i = 2017;
			int n;
			for (n = 1950; n <= i; n++) {
				int l = n % 4;
				if (l == 0) {
					System.out.println("leap year: " + n);
				}
			}
		}

	}

}
