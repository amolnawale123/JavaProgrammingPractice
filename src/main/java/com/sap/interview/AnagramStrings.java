package com.sap.interview;

import java.util.Arrays;

public class AnagramStrings {

	public static void isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "");
		String s2 = str2.replaceAll("\\s", "");
		
		boolean status = true;
		
		if(s1.length()!=s2.length()) {
			status=false;
		}else {
			char[] c1 = s1.toLowerCase().toCharArray();
			char[] c2 = s2.toLowerCase().toCharArray();
			Arrays.sort(c1);
			Arrays.sort(c2);
			status = Arrays.equals(c1, c2);
		}
		
		if(status) {
			System.out.println("The Strings "+str1+" and "+str2+" are Anagram");
		} else {
			System.out.println("The Strings "+str1+" and "+str2+" are NOT Anagram");
		}
	}
	public static void main(String[] args) {
		isAnagram("keep","peek");
		isAnagram("India","Outda");
		isAnagram("wow","oww");
	}

}
