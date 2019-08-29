package com.sap.java8concepts;

import java.util.ArrayList;
import java.util.List;

public class PipelineOperations {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("David");
		names.add("Peter");
		names.add("John");
		names.add("Brijesh");
		names.add("Lara");
		names.add("John");
		names.add("Peter");
		names.add("Eliza");

		// Normal Execution
		names.stream().filter((String name) -> name.length() > 4).skip(2).forEach(System.out::println);

		// Parallel Execution
		names.parallelStream().filter((String name) -> name.length() > 5).skip(2).forEach(System.out::println);
	}

}
