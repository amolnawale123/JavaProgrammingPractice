package com.sap.interview;

public class String_StringBuf {

	public static void main(String[] args) {

		String s1 = new String("Amol");
		String s2 = "Amol";
		StringBuffer sbuf = new StringBuffer("Amol");
		StringBuilder sbud = new StringBuilder("Amol");
		
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		//System.out.println(s1 == sbuf);// Compile Time error - Incompatible operand types String and StringBuffer
		System.out.println(s1.equals(sbuf));
		//System.out.println(s1 == sbud);// Compile Time error - Incompatible operand types String and StringBuilder
		
		System.out.println("=====================================");
		
		//System.out.println(s2 == sbuf);// Compile Time error - Incompatible operand types String and StringBuffer
		System.out.println(s2.equals(sbuf));
		
		//System.out.println(s2 == sbud);// Compile Time error - Incompatible operand types String and StringBuffer
		System.out.println(s2.equals(sbud));
		
		System.out.println("=====================================");
		
		//System.out.println(sbud == sbuf);// Compile Time error - Incompatible operand types StringBuilder and StringBuffer
		System.out.println(sbud.equals(sbuf));
		
		

	}

}
