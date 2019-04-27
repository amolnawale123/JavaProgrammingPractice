package com.sap.testproject.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList <String> al = new ArrayList<String>();
		al.add("Amol");
		al.add("Sachin");
		al.add("Deva");
		al.add("Amol");
		al.add("Ritesh");
		al.add(2, null);
		al.add(5, "Amit");
		//al.remove(2);
		
		ArrayList<String> al2 = new ArrayList<String>();
		al2.add("Amol");
		al2.add("Deva");
		
		al.retainAll(al2);
		
		Iterator<String> itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());			
		}
		
		
		/*System.out.println(System.lineSeparator());
	
		for(String obj:al){
			System.out.println(obj);
			//System.out.println(System.lineSeparator());
		}*/

	}

}
