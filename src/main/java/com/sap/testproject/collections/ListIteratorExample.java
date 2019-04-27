package com.sap.testproject.collections;

import java.util.ArrayList;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		al.add("Amol");
		al.add("Ashok");
		al.add("Amit");
		al.add("Ravi");
		al.add("Uday");
		al.add("Shashi");
		al.add("Umesh");
		al.add(3, "Sachin");
		System.out.println(al);
		System.out.println("element at 3rd position: " + al.get(2));

		ListIterator<String> itr = al.listIterator();
		System.out.println("traversing elements in forward direction...");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("traversing elements in backward direction...");
		while (itr.hasPrevious()) {
			System.out.println(itr.previous());
		}
	}
}
