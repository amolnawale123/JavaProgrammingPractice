package com.sap.interview;

public class MissingNumberInArray {

	public static int getMissingNumber(int[] arr) {
		int n = arr.length + 1;
		int sum = n * (n + 1) / 2;
		int remSum = 0;

		for (int i = 0; i < arr.length; i++) {
			remSum = remSum + arr[i];
		}
		int missingNumber = sum - remSum;
		return missingNumber;
	}

	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 4, 1, 5, 7 };
		System.out.println("Missing number in arr1 is : " + getMissingNumber(arr1));
		
		int[] arr2={1,2,4,5};
		System.out.println("Missing number in arr2 is : " + getMissingNumber(arr2));
	}

}
