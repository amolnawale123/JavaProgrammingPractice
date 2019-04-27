package com.sap.testproject.collections;

import java.util.Iterator;
import java.util.TreeSet;

public class TreesetExample {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<String>();
		set.add("Amol");
		set.add("Ajay");
		set.add("Amol");
		set.add("Atul");
		set.add("Abhay");
		set.add("Ajay");
		set.add("Aarav");
		set.add("Aaditya");
		//set.add(null);
		//set.add("-");
		
		Iterator<String> itr = set.iterator();
		set.add("Bhomik");
		while(itr.hasNext()){
			System.out.println(itr.next());
			
		}
		System.out.println("Size of the Set is :"+set.size());

	}

}
