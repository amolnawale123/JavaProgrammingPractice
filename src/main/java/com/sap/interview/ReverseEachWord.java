package com.sap.interview;

public class ReverseEachWord {

	public static void reverseEachWordOfString(String str) {
		String[] words = str.split(" ");
		String reverseStr = "";

		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			String reverseWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				reverseWord = reverseWord + word.charAt(j);
			}
			reverseStr = reverseStr + reverseWord + " ";
		}

		System.out.println("Input String is : =========");
		System.out.println(str);
		System.out.println();
		System.out.println("String with Reverse words is : ===============");
		System.out.println(reverseStr);
	}

	public static void main(String[] args) {
		reverseEachWordOfString("Welcome to Mickey Mouse Clubhouse");
	}

}
