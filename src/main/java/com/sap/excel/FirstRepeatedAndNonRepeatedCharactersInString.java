package com.sap.excel;

import java.util.HashMap;
import java.util.Map;

public class FirstRepeatedAndNonRepeatedCharactersInString {

	public static void firstRepeatedNonRepeatedCharacters(String str) {

		char[] chArr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (Character ch : chArr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		for (Character ch : chArr) {
			if (map.get(ch) == 1) {
				System.out.println("The first Non-Repeated Character in the String - " + str + " is " + ch);
				break;
			}
		}

		for (Character ch : chArr) {
			if (map.get(ch) > 1) {
				System.out.println("The first Repeated Character in the String - " + str + " is " + ch);
				break;
			}
		}
		
		System.out.println("=========================================================================");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstRepeatedNonRepeatedCharacters("JAVACONCEPTOFTHEDAY");
		firstRepeatedNonRepeatedCharacters("HELLO WORLD");

	}

}
