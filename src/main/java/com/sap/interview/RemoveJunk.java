package com.sap.interview;

public class RemoveJunk {

	public static void main(String[] args) {
		String s = "$$^$^% Hello &%&&*& World ^&*^*&";
		System.out.println("Original String: "+s);
		s = s.replaceAll("[^a-zA-Z0-9\\s]", "");
		System.out.println("Modified String : "+s.trim());

	}

}
