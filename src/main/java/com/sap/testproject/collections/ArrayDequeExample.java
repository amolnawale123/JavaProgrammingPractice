package com.sap.testproject.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeExample {

	public static void main(String[] args) {
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Ajit");
		deque.add("Vijay");
		deque.add("Ravi");
		deque.add("Rekha");
		deque.add("Amjad");
		deque.offer("Ranjit");
		deque.offer("Prem");
		deque.offerFirst("Jeevan");
		deque.offerFirst("Pran");
		// deque.add(null);
		
		System.out.println("Size: " + deque.size());

		System.out.println("After offerFirst Traversal...");

		for (String str : deque) {
			System.out.println(str);
		}
		
		deque.pollLast();
		deque.pollFirst();
		System.out.println("After pollLast() Traversal...");  
	    for(String s:deque){  
	        System.out.println(s);  
	    }  
	}

}
