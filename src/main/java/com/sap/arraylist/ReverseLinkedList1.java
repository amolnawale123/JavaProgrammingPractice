package com.sap.arraylist;

import java.util.LinkedList;

/**
 * creating a new Arraylist and adding the elements to it in reverse order
 * @author amonaw
 *
 */
public class ReverseLinkedList1 {

	static LinkedList<String> reverseList(LinkedList<String> list) {
		LinkedList<String> reverseList = new LinkedList<String>();
		for (int i = list.size() - 1; i >= 0; i--) {
			reverseList.add(list.get(i));

		}
		return reverseList;
	}

	public static void main(String[] args) {
		LinkedList<String> linkedli = new LinkedList<String>();
		// Appending elements at the end of the list
		linkedli.add("Goa");
		linkedli.add("Chennai");
		linkedli.add("Mumbai");
		linkedli.add("Ahmedabad");
		linkedli.add("Kanpur");
		linkedli.add("Trivendrum");
		linkedli.add("Bangalore");
		linkedli.add("Pune");
		System.out.print("Elements before reversing: " + linkedli);
		System.out.println();
		System.out.println("=================================================");
		System.out.print("Elements after reversing: " + reverseList(linkedli));

	}

}
