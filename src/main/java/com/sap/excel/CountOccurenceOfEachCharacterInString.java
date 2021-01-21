package com.sap.excel;

import java.util.HashMap;
import java.util.Map;

/**
 * Count Occurrences Of Each Character In String :
 * @author amonaw
 *
 */
public class CountOccurenceOfEachCharacterInString {

	public static void getCharCount(String str) {
		char[] chArr = str.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		
		for(Character ch:chArr) {
			if(map.containsKey(ch)) {
				map.put(ch, map.get(ch)+1);
			}else {
				map.put(ch, 1);
			}
			
			
		}
		System.out.println(str + " : " + map);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getCharCount("JAVA J2EE JSP SPRING HIBERNATE STRUTS");
		getCharCount("ALL IS WELL");
	}

}
