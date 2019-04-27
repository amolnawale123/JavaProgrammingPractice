package com.sap.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class WordCount1 {

	public static void main(String[] args) {
		String sampleSentence = "The quick     brown brown brown \tfox fox \njumps\n\nover the\tlazy\r\ndog dog";
		   String[] words = sampleSentence.split("\\s+");
		   int itemCount = words.length;
		   System.out.println("The number of words is: " + itemCount);
		   for (int i = 0; i < itemCount; i++) {
		      String word = words[i];
		      System.out.println(word);
		   }
		   
		   Map<String,Integer> map = new HashMap<String,Integer>();
		   for(String str:words) {
			   if(map.containsKey(str)) {
				   map.put(str, map.get(str)+1);
			   }else {
				   map.put(str, 1);
			   }
		   }
		   
		   System.out.println(map.toString());
		   
		   Set<String> set = map.keySet();
		   for(String str1:set) {
			   System.err.println(str1 + " --> "+ map.get(str1));
		   }
		
	}

}
