package com.sap.excel;

public class AnagramStringsWithIteration {

	public static void isAnagram(String str1, String str2) {
		String s1 = str1.replaceAll("\\s", "").toLowerCase();
		String s2 = str2.replaceAll("\\s", "").toLowerCase();

		boolean flag = true;

		if (s1.length() != s2.length()) {
			flag = false;
		} else {
			char[] arr1 = s1.toCharArray();
			for (char c : arr1) {
				int index = s2.indexOf(c);
				if (index != -1) {
					s2 = s2.substring(0, index) + s2.substring(index + 1, s2.length());
				} else {
					flag = false;
					break;
				}
			}
		}

		if(flag)
        {
            System.out.println(s1+" and "+s2+" are anagrams");
        }
        else
        {
            System.out.println(s1+" and "+s2+" are not anagrams");
        }
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isAnagram("Mother In Law", "Hitler Woman");

	}

}
