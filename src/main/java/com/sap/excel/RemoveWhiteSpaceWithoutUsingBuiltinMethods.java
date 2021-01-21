package com.sap.excel;

public class RemoveWhiteSpaceWithoutUsingBuiltinMethods {

	public static void removeWhiteSpace(String str) {
		char[] chArr = str.toCharArray();
		String stringWithoutWhiteSpaces = "";
		for (int i = 0; i < chArr.length; i++) {
			if (chArr[i] != ' ' && chArr[i] != '\t') {
				stringWithoutWhiteSpaces = stringWithoutWhiteSpaces + chArr[i];
			}
		}

		System.out.println("String without white spaces : " + stringWithoutWhiteSpaces);
	}

	public static void main(String[] args) {
		removeWhiteSpace("OneSpace TwoSpaces  ThreeSpaces   FourSpaces    Tab        End");

	}

}
