package com.sap.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

public class ReverseLinkedHashSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// creating LinkedHashSet object of type String
		Set<String> lhsCompanies = new LinkedHashSet<String>();

		// adding elements to LinkedHashSet object
		lhsCompanies.add("LinkedIn");
		lhsCompanies.add("Amazon");
		lhsCompanies.add("Google");
		lhsCompanies.add("Apple");
		lhsCompanies.add("Facebook");
		lhsCompanies.add("Oracle");
		lhsCompanies.add("Microsoft");

		// Iterating using enhanced for-loop
		System.out.println("Insertion Order: Iterating LinkedHashSet\n");
		for (String company : lhsCompanies) {
			System.out.print(" "+company);
		}

		System.out.println();
		// convert to ArrayList
		ArrayList<String> alCompanies = new ArrayList<String>(lhsCompanies);

		// to reverse LinkedHashSet contents
		Collections.reverse(alCompanies);

		// reverse order of LinkedHashSet contents
		System.out.println("\nReverse Order of LinkedHashSet\n");
		for (String company : alCompanies) {
			System.out.print(" "+company);
		}
	}

}
