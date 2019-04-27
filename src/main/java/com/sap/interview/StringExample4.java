package com.sap.interview;

public class StringExample4 {

	public static void main(String[] args) {
		String str = "123a";
		try {
			System.out.println(Integer.parseInt(str));
		} catch (NumberFormatException e) {
			System.out.println(e.getClass().getName());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

}
