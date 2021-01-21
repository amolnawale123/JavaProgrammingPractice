package com.sap.excel;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersInString {

	public static void getDuplicateCharCount(String str) {
		char[] chArr = str.toCharArray();
		Map<Character, Integer> map = new HashMap<>();

		for (Character ch : chArr) {
			if (map.containsKey(ch)) {
				map.put(ch, map.get(ch) + 1);
			} else {
				map.put(ch, 1);
			}
		}

		Set<Character> set = map.keySet();

		System.out.println("Duplicate characters in the String - " + str);

		for (Character ch : set) {
			if (map.get(ch) > 1) {
				System.out.println(ch + " : " + map.get(ch));
			}
		}

	}

	public static void main(String[] args) {

		getDuplicateCharCount("JAVAJ2EEJSP");
		getDuplicateCharCount("Bitter Butter");
		getDuplicateCharCount("Fresh Fish");

	}

}
