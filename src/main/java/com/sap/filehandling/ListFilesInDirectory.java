package com.sap.filehandling;

import java.io.File;

public class ListFilesInDirectory {
	public static void main(String[] args) {
		File path = new File("C:\\SAP\\People Connect 365");
		String[] files = path.list();
		for(String file:files) {
			System.out.println(file);
		}
		
		System.out.println("===========================================================");
		File[] filees = path.listFiles();
		for(File fil:filees) {
			System.out.println(fil.getAbsolutePath());
			System.out.println(fil.getName());
			System.out.println("---------------------------");
		}
	}
}
