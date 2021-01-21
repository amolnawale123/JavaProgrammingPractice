package com.sap.arraylist;

import java.util.Collections;
import java.util.LinkedList;

/**
 * Using inbuilt reverse() method
 * 
 * @author amonaw
 *
 */
public class ReverseLinkedList {

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
	        Collections.reverse(linkedli);
	        System.out.print("Elements After reversing: " + linkedli);

	}

}
