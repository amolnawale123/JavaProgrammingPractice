package com.sap.arraylist;

import java.util.HashSet;
import java.util.Set;

public class TwoNumbersAddToSumWithHashset {

	public static void twoSum(int[] arr, int sum) {
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			int temp = sum - arr[i];
			if (set.contains(temp)) {
				System.out.println("Pair with given sum " + sum + " is: (" + arr[i] + ", " + temp + ")");
			}
			set.add(arr[i]);
		}

	}

	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, 8 };
		int n = 16;
		twoSum(A, n);
	}

}
