package com.sap.java8concepts;

public class RunnableDemo {

	public static void main(String[] args) {

		new Thread(() -> {
			System.out.println("New Thread started");
		}).start();

	}

}
