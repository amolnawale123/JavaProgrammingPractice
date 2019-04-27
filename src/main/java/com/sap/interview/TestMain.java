package com.sap.interview;

public class TestMain {

	public static void main(String[] args) {
		System.out.println("main method - 1");
		main("Amol");
		main(11);
		main(1,2);
	}
	
	public static void main(String args) {
		System.out.println("main method - 2");
	}
	
	public static void main(int a) {
		System.out.println("main method - 3");
	}
	
	public static void main(int a, int b) {
		System.out.println("main method - 4");
	}

}
