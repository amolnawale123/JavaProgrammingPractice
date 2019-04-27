package com.sap.testproject.collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(100, "Amol");
		map.put(101, "Sachin");
		map.put(102, "Deva");
		map.put(103, "Ritesh");
		map.put(104, "Yash");
		map.put(104, "Surbhi");
		map.put(105, null);
		map.put(null, "Prajakta");
		
		for(Map.Entry m:map.entrySet()){
			System.out.println(m.getKey()+"="+m.getValue());
		}
		
		map.remove(105);
		
		System.out.println("Values after remove: "+ map);

	}

}
