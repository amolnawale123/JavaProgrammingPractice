package com.sap.filehandling;

import java.io.File;
import java.io.FilenameFilter;

public class ListFilesWithFilters {

	public static void main(String[] args) {
		File path = new File("C:\\SAP\\People Connect 365");

		FilenameFilter txtFilter = new FilenameFilter() {

			@Override
			public boolean accept(File dir, String name) {

				if (name.endsWith(".csv")) {
					return true;
				} else {
					return false;
				}
			}
		};
		
		File[] files = path.listFiles(txtFilter);
		for(File file:files) {
			System.out.println(file.getName());
		}
		
		
	}

}
