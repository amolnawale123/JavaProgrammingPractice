package com.sap.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> alist = new ArrayList<>();
		alist.add("Virat");
		alist.add("ganesh");
		alist.add("Amol");
		alist.add("Ritesh");
		alist.add("deva");
		alist.add("sachin");
		alist.add("Xavier");
		
		System.out.println("Arraylist before sorting: ");
		System.out.println(alist);
		
		//Collections.sort(alist);
		Collections.sort(alist,String.CASE_INSENSITIVE_ORDER);
		
		System.out.println("Arraylist after sorting: ");
		System.out.println(alist);
		
				

	}

}
