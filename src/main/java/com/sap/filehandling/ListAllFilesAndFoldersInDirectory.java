package com.sap.filehandling;

import java.io.File;
import java.io.FilenameFilter;

public class ListAllFilesAndFoldersInDirectory {

	public static void main(String[] args) {

		File folder = new File("C:/Amol");
		
		// Using File.list() method
		String[] files = folder.list();
		for (String file : files) {
			//System.out.println(file);
		}
		
		// Using File.listFiles() method
		File[] allFiles = folder.listFiles();
		for (File file : allFiles) {
		//	System.out.println(file);
		}
		
		// Using File.listFiles(FilenameFilter filter) 
		FilenameFilter txtFilter = new FilenameFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				if(name.endsWith(".txt")) {
					return true;
				}
				else {
					return false;
				}
			}
		};
		
		File[] filees = folder.listFiles(txtFilter);
		for (File file : filees) {
			System.out.println(file.getName());
		}

	}

}
