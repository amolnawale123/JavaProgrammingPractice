package com.sap.oops;

public class PolymorphismConcept {

	class A{
		void run() {
			System.out.println("Run from A Class");
		}
	}
	
	class B extends A{
		void run() {
			System.out.println("Run from B Class");
		}
		
		void walk() {
			System.out.println("Walk from B Class");
		}
	}
	
	
	public static void main(String[] args) {

		PolymorphismConcept poly = new PolymorphismConcept();
		A obj = poly.new B();
		obj.run();
		
		
	}

}
