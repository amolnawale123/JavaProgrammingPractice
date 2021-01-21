package com.sap.excel;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicateWordsInString {

	public static void duplicateWordsInString(String str) {
		String[] words = str.split(" ");
		Map<String, Integer> map = new HashMap<>();
		for (String word : words) {
			if (map.containsKey(word.toLowerCase())) {
				map.put(word.toLowerCase(), map.get(word.toLowerCase()) + 1);
			} else {
				map.put(word.toLowerCase(), 1);
			}
		}

		Set<String> set = map.keySet();

		for (String word : set) {
			if (map.get(word) > 1) {
				System.out.println(word + " : " + map.get(word));
			}
		}

	}

	public static void main(String[] args) {
		duplicateWordsInString("He Man Bat Man Super Man Spider Man");

	}

}
