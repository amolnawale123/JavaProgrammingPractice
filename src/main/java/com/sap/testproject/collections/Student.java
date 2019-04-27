package com.sap.testproject.collections;

public class Student {
	int rollno, age;
	String name;

	Student(int rollno, String name, int age) {
		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public int hashCode() {
		return rollno;
	}
	
	@Override
	public boolean equals(Object obj) {
		Student student = (Student) obj;
		return (rollno == student.rollno);
	}
	
	@Override
	public String toString() {
		return rollno+", "+name+", "+age;
	}
	
	

}
