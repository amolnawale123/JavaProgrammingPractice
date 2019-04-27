package com.sap.testproject.collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetExample {

	public static void main(String[] args) {
		HashSet<String> set = new HashSet<String>();
		set.add("Amol");
		set.add("Ajay");
		set.add("Amol");
		set.add("Atul");
		set.add("Abhay");
		set.add("Ajay");
		set.add("Aarav");
		set.add("Aaditya");
		set.add(null);
		
		Iterator<String> itr = set.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
		
	}

}
