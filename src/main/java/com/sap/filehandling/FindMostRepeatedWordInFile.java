package com.sap.filehandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FindMostRepeatedWordInFile {

	public static void main(String[] args) {
		
		Map<String,Integer> map = new HashMap<>();
		File file = new File("C:\\Amol\\sample.txt");
		BufferedReader reader = null;
		try {
			FileReader fr = new FileReader(file);
			reader = new BufferedReader(fr);
			
			String currentLine = reader.readLine();
			while(currentLine !=null) {
				String[] words = currentLine.toLowerCase().split("\\s");
				
				for (String word : words) {
					if(map.containsKey(word)) {
						map.put(word, map.get(word)+1);
					}else {
						map.put(word, 1);
					}
				}
				
				currentLine = reader.readLine();
			}
			
			String mostRepeadtedWord = null;
			
			int count=0;
			
			Set<Entry<String, Integer>> entryset = map.entrySet();
			for (Entry<String, Integer> entry : entryset) {
				if(entry.getValue()>count) {
					mostRepeadtedWord = entry.getKey();
					count = entry.getValue();
				}
			}
			
			System.out.println("The most repeated word in input file is : "+mostRepeadtedWord);
            
            System.out.println("Number Of Occurrences : "+count);
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally
        {
            try
            {
                reader.close();           //Closing the reader
            }
            catch (IOException e) 
            {
                e.printStackTrace();
            }
        }

	}

}
