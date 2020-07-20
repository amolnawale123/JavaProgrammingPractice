package com.sap.interview;

public class ChangeString {

	public static String changedString(String str) {
		
		String empty = "";
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			empty=empty+Character.toUpperCase(str.charAt(i));
			//empty=empty.toUpperCase();
			
			for(int j=0;j<i;j++) {
				empty=empty+str.charAt(i);
			}
			
			if(!(i==str.length()-1)) {
				empty=empty+"-";
			}
			
		}
		
		System.out.println("Empty: " + empty);
		
		
		
		return empty;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		changedString("ZpglnRxqenU");
	}

}
