   package com.sap.interview;

import java.io.IOException;

public class StringBasics1 {

	public static void main(String[] args) {

		String s1 = new String("ONE");
		String s2 = "ONE";
		System.out.println(s1 == s2);
		
		int i = (byte) + (char) - (int) + (long) - 1;
		 
        System.out.println(i);
        
        try
        {
            Runtime.getRuntime().exec("notepad.exe");
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
	}

}
