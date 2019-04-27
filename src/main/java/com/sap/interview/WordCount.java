package com.sap.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WordCount {

	public static void main(String[] args) {
		String str = "I live in Pune. Pune city is in Maharashtra. Pune is also called as the Oxford of the east";
		int count = str.split("Pune").length-1;
		System.out.println(count);
		
		Pattern p = Pattern.compile("Pune");
		Matcher m = p.matcher(str);
		int i=0;
		while(m.find()) {
			i++;
		}
		System.out.println(i);
		
	}

}
