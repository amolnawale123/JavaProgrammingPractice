package com.sap.arrays;

import java.util.Arrays;

public class MergeUnsortedArrays {

	public static int[] mergeArrays(int[] arrA, int[] arrB) {
		int[] mergedArr = new int[arrA.length+arrB.length];
		int i=0,j=0,k=0;
		while(i<arrA.length) {
			mergedArr[k]=arrA[i];
			i++;
			k++;
		}
		
		while(j<arrB.length) {
			mergedArr[k]=arrB[j];
			j++;
			k++;
		}
		
		Arrays.sort(mergedArr);
		return mergedArr;
		
	}
	
	public static void main(String[] args) {
		int[] arrayA=new int[] {12,-7,18,9,37,-1,-2,21};
		int[] arrayB=new int[] {27,8,71,-9,18};
		int[] mergedArray = mergeArrays(arrayA,arrayB);
		System.out.println("Array A : "+ Arrays.toString(arrayA));
		System.out.println("Array B : "+ Arrays.toString(arrayB));
		System.out.println("Merged Array : "+ Arrays.toString(mergedArray));
	}

}
