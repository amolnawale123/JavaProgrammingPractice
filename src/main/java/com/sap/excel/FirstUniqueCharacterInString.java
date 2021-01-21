package com.sap.excel;

import java.util.HashMap;
import java.util.Map;

public class FirstUniqueCharacterInString {

	public static int firstUniqueChar(String str) {
		Map<Character,Integer> map = new HashMap<>();
		int len = str.length();
		for(int i = 0;i<len;i++) {
			char c = str.charAt(i);
			map.put(c, map.getOrDefault(c, 0)+1);
		}
		
		for(int i = 0;i<len;i++) {
			if(map.get(str.charAt(i))==1) {
				return i;
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(firstUniqueChar("GeeksForGeeks"));

	}

}
