package com.sap.excel;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 * Java Program To Find Maximum Occurring Character In String :
 * @author amonaw
 *
 */
public class MaxOccuringCharacterInString {

	public static void getCharCount(String str) {
		
		char[] chArr = str.toCharArray();
		Map<Character,Integer> map = new HashMap<>();
		
		for(Character ch:chArr) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			} else {
				map.put(ch, map.get(ch)+1);
			}
		}
		
		
		Set<Entry<Character,Integer>> entrySet = map.entrySet();
		
		int maxCount = 0;
        
        char maxChar = 0;
         
        for (Entry<Character, Integer> entry : entrySet) 
        {
            if (entry.getValue() > maxCount)
            {
                maxCount = entry.getValue();
                 
                maxChar = entry.getKey();
            }
        }
        
        System.out.println("Input String : "+str);
        
        System.out.println("Maximum Occurring char and its count :");
         
        System.out.println(maxChar+" : "+maxCount);
		
	}
	
	public static void main(String[] args) {

		String str = "AAABBCCCDDEFFFFF";
		getCharCount(str);

	}

}
