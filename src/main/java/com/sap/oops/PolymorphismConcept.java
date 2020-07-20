package com.sap.oops;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;

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
		B obj = (B) poly.new A();
		obj.run();
		
		
	}

}
