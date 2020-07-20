package com.sap.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FindNumberOfCharsWordsLinesInAFile {

	public static void main(String[] args) {

		int lineCount = 0;
		int wordCount = 0;
		int charCount = 0;

		File file = new File("C:\\Amol\\sample1.txt");
		BufferedReader reader = null;
		try {
			FileReader fr = new FileReader(file);
			reader = new BufferedReader(fr);

			String currentLine = reader.readLine();
			while (currentLine != null) {
				lineCount++;

				String[] words = currentLine.toLowerCase().split("\\s");

				wordCount = wordCount + words.length;
				for (String word : words) {
					charCount = charCount + word.length();
				}

				currentLine = reader.readLine();
			}

			System.out.println("Number of Lines: " + lineCount);
			System.out.println("Number of Words: " + wordCount);
			System.out.println("Number of Characters: " + charCount);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close(); // Closing the reader
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}

}
