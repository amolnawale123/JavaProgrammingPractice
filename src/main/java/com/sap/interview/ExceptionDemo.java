package com.sap.interview;

public class ExceptionDemo {

	public static void main(String[] args) {
		try {
			System.out.println("I am in the Try Block now");
			int c= 100/0;
			System.out.println("Result : "+ c);
		}
		/*catch(Exception e) {
			e.printStackTrace();
		}*/
		finally {
			System.out.println("I am in the finally block");
		}
		
		System.out.println("I am outside the finally block");
	}

}
