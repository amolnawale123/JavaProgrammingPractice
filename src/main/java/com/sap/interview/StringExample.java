package com.sap.interview;

public class StringExample
{
    public static void main(String[] args)
    {
        String s = "Java Concept Of The Day";
 
        //Converting string 's' into character array.
 
        char[] dst = s.toCharArray();
 
        for (char c : dst)
        {
            System.out.print(c);     //Output : Java Concept Of The Day
        }
        
        String s1 = new String("Amol");
        String s2 = new String("Amol");
        System.out.println();
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));
    }
}
