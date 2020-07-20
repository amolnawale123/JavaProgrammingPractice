package com.sap.interview;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {

	public static boolean validParentheses( String braces ) {
	   
	    if(braces.length()%2 != 0 ){
	      // String contains Odd number of characters, hence invalid.
	      return false;
	    }
	    
	    HashMap<Character, Character> map = new HashMap<Character, Character>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		
	    Stack<Character> st = new Stack<Character>();
	    for (int i = 0; i < braces.length(); i++) {
			char curr = braces.charAt(i);
	 
			if (map.keySet().contains(curr)) {
				st.push(curr);
			} else if (map.values().contains(curr)) {
				if (!st.empty() && map.get(st.peek()) == curr) {
					st.pop();
				} else {
					return false;
				}
			}
		}
	    
	    return st.empty();
	  }
	
	public static void main(String[] args) {
		validParentheses("(())");
	}

}
