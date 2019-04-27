/**
 * 
 */
package com.sap.testproject.collections;

import java.util.HashSet;
import java.util.Iterator;



/**
 * @author C5228790
 *
 */
public class StudentHashsetExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		HashSet<Student> set = new HashSet<Student>();
		set.add(new Student(101,"Amol",38));
		set.add(new Student(102,"Sachin",35));
		set.add(new Student(103,"Deva",40));
		set.add(new Student(104,"Ambar",27));
		set.add(new Student(105,"Ritesh",33));
		set.add(new Student(106,"Vandana",34));
		set.add(new Student(103,"Prashasti",24));
		set.add(new Student(104,"Surbhi",28));
		
		Iterator<Student> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().toString());
		}
		
		
	}

}
