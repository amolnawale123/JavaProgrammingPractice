package com.sap.testproject.collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashsetExample {

	public static void main(String[] args) {
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Amol");
		set.add("Ajay");
		set.add("Amol");
		set.add("Atul");
		set.add("Abhay");
		set.add("Ajay");
		set.add("Aarav");
		set.add("Aaditya");
		set.add(null);
		set.add("-");
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		System.out.println("Size of the Set is :"+set.size());

	}

}
