package com.sap.arraylist;

import java.util.LinkedHashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeatingCharacters {

	public static void longestString(String str) {

		char[] arr = str.toCharArray();
		String longStr = null;
		int strLen = 0;

		Map<Character, Integer> map = new LinkedHashMap<>();

		for (int i = 0; i < arr.length; i++) {
			char ch = arr[i];
			if (!map.containsKey(ch)) {
				map.put(ch, i);
			} else {
				i = map.get(ch);
				map.clear();
			}
		}

		if (map.size() >= strLen) {
			strLen = map.size();
			longStr = map.keySet().toString();
		}

		System.out.println("Input String : " + str);
		System.out.println("The longest substring : " + longStr);
		System.out.println("The longest Substring Length : " + strLen);
		System.out.println("=============================================");

	}

	public static void main(String[] args) {
		longestString("JavaConceptoftheDay");
		longestString("pickoutthelongestsubstring");
		longestString("bbbbbbbbbbbbbbbbbbbb");
		longestString("pwwkew");

	}

}
