package com.sap.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindAllRepeatedWordsInFile {

	public static void main(String[] args) {

		Map<String, Integer> map = new HashMap<>();
		File file = new File("C:\\Amol\\sample.txt");
		BufferedReader reader = null;
		try {
			FileReader fr = new FileReader(file);
			reader = new BufferedReader(fr);

			String currentLine = reader.readLine();
			while (currentLine != null) {
				String[] words = currentLine.toLowerCase().split("\\s");

				for (String word : words) {
					if (map.containsKey(word)) {
						map.put(word, map.get(word) + 1);
					} else {
						map.put(word, 1);
					}
				}

				currentLine = reader.readLine();
			}

			Set<Entry<String, Integer>> entryset = map.entrySet();
			List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(entryset);
			Collections.sort(list, new Comparator<Entry<String, Integer>>() 
            {
                @Override
                public int compare(Entry<String, Integer> e1, Entry<String, Integer> e2) 
                {
                    return (e2.getValue().compareTo(e1.getValue()));
                }
            });

			for (Entry<String, Integer> entry : list) {
				if (entry.getValue() > 1) {
					System.out.println(entry.getKey() + " : " + entry.getValue());
				}
			}

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
