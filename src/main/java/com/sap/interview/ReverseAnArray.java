package com.sap.interview;

import java.util.Arrays;

public class ReverseAnArray {

	static void reverseArray(int inputArr[]) {
		System.out.println("Array Before Reversing: ==> " + Arrays.toString(inputArr));
		int temp;
		for (int i = 0; i < inputArr.length / 2; i++) {
			temp = inputArr[i];
			inputArr[i] = inputArr[inputArr.length - 1 - i];
			inputArr[inputArr.length - 1 - i] = temp;
		}
		System.out.println("Array After Reversing: ==> " + Arrays.toString(inputArr));
	}

	public static void main(String[] args) {
		reverseArray(new int[]{1,2,3,4,5});
		System.out.println("-----------------------------------------");
		reverseArray(new int[]{11,12,13,14,15});
		System.out.println("-----------------------------------------");
		
	}

}
