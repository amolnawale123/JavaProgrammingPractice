package com.sap.interview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SubstringInJava {

	public static void main(String[] args) {
//		String str = "Failed Message: (0)";
//		System.out.println(str.trim().substring(17, 18));
//
//		String str1 = "Registered Apps (192)";
//		System.out.println(str1.trim().substring(17, 19));
		
		String str2 = "Active Tokens ()";
		boolean count = str2.matches("Active Tokens \\(\\[^0]|[0-9]+\\)");
		System.out.println(count);


		Pattern re = Pattern.compile("[a-zA-Z ]*(\\d+)");
		  Matcher m = re.matcher(str2);
		  //int mIdx = 0;
		    /*while (m.find()){
		      for( int groupIdx = 0; groupIdx < m.groupCount()+1; groupIdx++ ){
		        System.out.println( "[" + mIdx + "][" + groupIdx + "] = " + m.group(groupIdx));
		      }
		      mIdx++;
		    }*/
		  if(m.find()) {
			  int token = Integer.parseInt(m.group(0));
			  System.out.println(token);
		  }
	}

}
