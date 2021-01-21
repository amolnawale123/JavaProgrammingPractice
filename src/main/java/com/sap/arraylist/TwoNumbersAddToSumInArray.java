package com.sap.arraylist;

import java.util.Arrays;

public class TwoNumbersAddToSumInArray {

	public static boolean twoSum(int[] arr, int arrSize, int sum) {
		int l, r;
		Arrays.sort(arr);
		l = 0;
		r = arrSize - 1;
		while (l < r) {
			if (arr[l] + arr[r] == sum) {
				return true;
			} else if (arr[l] + arr[r] < sum) {
				l++;
			} else {
				r--;
			}

		}
		return false;
	}

	public static void main(String[] args) {
		int A[] = { 1, 4, 45, 6, 10, -8 };
		int n = 16;
		int arr_size = A.length;

		// Function calling
		if (twoSum(A, arr_size, n)) {
			System.out.println("Array has two elements with given sum");
		} else {
			System.out.println("Array doesn't have two elements with given sum");
		}
	}

}
