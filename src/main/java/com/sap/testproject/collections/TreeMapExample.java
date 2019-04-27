package com.sap.testproject.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Integer, String> tm = new TreeMap<Integer, String>();
		tm.put(110, "Ashok");
		tm.put(108, "Rathin");
		tm.put(109, "Suchir");
		tm.put(107, "Bhushan");
		tm.put(106, "Bhakti");
		tm.put(105, "Aparna");
		tm.put(104, "Rahul");
		tm.put(103, "Ila");
		tm.put(102, "Pari");
		tm.put(101, null);

		for (Map.Entry m : tm.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
		
		tm.remove(105);
		
		System.out.println(tm);

	}

}
