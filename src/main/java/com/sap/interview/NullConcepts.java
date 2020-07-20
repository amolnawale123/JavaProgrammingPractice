package com.sap.interview;

public class NullConcepts {

	public static void main(String[] args) {

		String s1 = null;
		String s2 = null;
		NullConcepts nc = null;
		//System.out.println(s1.equals(s2)); // NPE
		System.out.println(s1 == s2); // true

		System.out.println(null == null);// true
		System.out.println(null != null); // false
		System.out.println("---------------------");
		nc.staticMethod(); // I am a static method
		nc.nonStaticMethod(); // NPE

	}

	public static void staticMethod() {
		System.out.println("I am a static method");
	}
	
	public void nonStaticMethod() {
		System.out.println("I am a non static method");
	}
}
