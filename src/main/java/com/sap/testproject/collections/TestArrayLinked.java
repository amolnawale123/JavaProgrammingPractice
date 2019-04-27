package com.sap.testproject.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestArrayLinked {

	public static void main(String[] args) {
		List<String> list1=new ArrayList<String>();
		list1.add("Ravi");
		list1.add("Vijay");
		list1.add("Ashok");
		list1.add("Ajay");
		
		List<String> list2 = new LinkedList<String>();
		list2.add("James");
		list2.add("Serena");
		list2.add("Swati");
		list2.add("Junaid");
		list2.add("Ishtiak");
		
		System.out.println("arraylist: "+list1);
		System.out.println("linkedlist: "+list2);
		
		System.out.println("Element at 2nd position: "+list2.get(1)); 
		
		

	}

}
