package com.sap.testproject.collections;

import java.util.Enumeration;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		Vector<Integer> vc = new Vector<>();
		vc.add(1);
		vc.add(2);
		vc.add(3);
		System.out.println(vc.size());
		System.out.println(vc.capacity());
		System.out.println(vc);
		vc.setSize(5);
		System.out.println(vc.size());
		System.out.println(vc);
		vc.setElementAt(4, 3);
		vc.setElementAt(5, 4);
		
		Enumeration<Integer> en = vc.elements();
		while(en.hasMoreElements()) {
			System.out.println(en.nextElement());
		}
		System.out.println(vc.size());
		
		System.out.println(vc.firstElement());
		System.out.println(vc.lastElement());
	}

}
