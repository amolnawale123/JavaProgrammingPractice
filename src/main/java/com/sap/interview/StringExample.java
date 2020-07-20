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
        System.out.println(s1==s2); // Output: false, since memory locations are different
        System.out.println(s1.equals(s2)); // Output: true, since contents are the same.
        
        String s3="Java";
        String s4="Java";
        System.out.println(s3==s4); // Output: true, since memory locations are the same.
        System.out.println(s3.equals(s4)); // Output: true, since contents are the same.
    }
}
