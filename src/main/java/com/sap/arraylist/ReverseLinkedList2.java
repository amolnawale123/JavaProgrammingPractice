package com.sap.arraylist;

import java.util.LinkedList;

/**
 * without creating any new list and reversing the elements in the same list.
 * @author amonaw
 *
 */
public class ReverseLinkedList2 {

	static LinkedList<String> reverseList(LinkedList<String> list) {
		for (int i = 0; i < list.size() / 2; i++) { 
            String temp = list.get(i); 
            list.set(i, list.get(list.size() - i - 1)); 
            list.set(list.size() - i - 1, temp); 
        } 
		return list;
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
