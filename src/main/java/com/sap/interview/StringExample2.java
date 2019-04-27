package com.sap.interview;

public class StringExample2 {

	public static void main(String[] args) {
		String str = "20 / 2819" ;
		String[] ar = str.split("/");
		System.out.println(ar[0].trim().toString());
		System.out.println(ar[1].trim().toString());
	}

}
