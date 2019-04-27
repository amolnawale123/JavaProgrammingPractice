package com.sap.interview;

public class ExceptionChaining {

	public static void main(String[] args) {
		try {
			NumberFormatException ex = new NumberFormatException("Exception");
			ex.initCause(new NullPointerException("This is the actual cause of the exception"));
			throw ex;
		}catch(NumberFormatException ex) {
			System.out.println(ex);
			System.out.println(ex.getCause());
		}
	}

}
