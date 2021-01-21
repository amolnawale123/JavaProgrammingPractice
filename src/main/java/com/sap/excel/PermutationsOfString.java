package com.sap.excel;

public class PermutationsOfString {

	public static void StringPermutation(String str) {
		doPermutation("", str);
	}

	public static void doPermutation(String permutation, String input) {
		if (input.length() == 0) {
			System.out.println(permutation);
		} else {
			for (int i = 0; i < input.length(); i++) {
				doPermutation(permutation + input.charAt(i),
						input.substring(0, i) + input.substring(i + 1, input.length()));
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPermutation("ABC");

	}

}
