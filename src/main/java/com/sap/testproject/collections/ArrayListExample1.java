package com.sap.testproject.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample1 {

	public static void main(String[] args) {
		Student s1 = new Student(101,"Amol",36);
		Student s2 = new Student(102,"Amit",40);
		Student s3 = new Student(103,"Abhay",34);
		Student s4 = new Student(104,"Akshay",30);
		
		ArrayList<Student> al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		
		Iterator<Student> itr = al.iterator();
		while(itr.hasNext()){
			Student st = itr.next();
			System.out.println(st.rollno+" : "+st.name+" : "+st.age);
		}
		

	}

}
