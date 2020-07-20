package com.sap.arraylist;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicatesFromArrayList {

	public static void main(String[] args) {
		 //Constructing An ArrayList
		 
        List<String> list1 = new ArrayList<String>(); 
        list1.add("JAVA"); 
        list1.add("J2EE"); 
        list1.add("JSP"); 
        list1.add("SERVLETS"); 
        list1.add("JAVA"); 
        list1.add("STRUTS"); 
        list1.add("JSP");
 
        //Printing list1 
        System.out.print("ArrayList With Duplicate Elements :");        
        System.out.println(list1);
        
        Set<String> set = new LinkedHashSet<>(list1);
        
        List<String> list2 = new ArrayList<>(set);
        
        System.out.print("ArrayList Without Duplicate Elements :");        
        System.out.println(list2);

		

	}

}
