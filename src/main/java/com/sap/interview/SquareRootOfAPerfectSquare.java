package com.sap.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SquareRootOfAPerfectSquare {

	public static List<Integer> list = new ArrayList<Integer>();

	static void findFactors(int n) {
		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				list.add(i);
				System.out.print(i + " ");
				
			}
		}

		System.out.println();
		int quo;
		for (int j = 0; j < list.size(); j++) {
			quo = n / list.get(j);
			if (quo == list.get(j)) {
				
				System.out.println("Square Root of the Perfect Square " + n + " is :" + list.get(j));
			}else {
				System.out.println(n+" is not a perfect square.");
			}
		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number greater than 0");
		int num = sc.nextInt();
		System.out.println("The divisors of the number " + num + " are:");
		findFactors(num);
		sc.close();
	}

}
