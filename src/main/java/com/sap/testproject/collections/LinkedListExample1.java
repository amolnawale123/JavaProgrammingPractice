package com.sap.testproject.collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample1 {

	public static void main(String[] args) {
		List<Book> list = new LinkedList<Book>();
		Book b1 = new Book(101, "Let us C", "Yashwant Kanetkar", "BPB", 8);
		Book b2 = new Book(102, "Data Communications & Networking", "Forouzan", "Mc Graw Hill", 4);
		Book b3 = new Book(103, "Operating System", "Galvin", "Wiley", 6);

		list.add(b1);
		list.add(b2);
		list.add(b3);

		for (Book b : list) {
			System.out.println(b.id + " : " + b.name + " : " + b.author + " : " + b.publisher + " : " + b.quantity);
		}

	}

}
