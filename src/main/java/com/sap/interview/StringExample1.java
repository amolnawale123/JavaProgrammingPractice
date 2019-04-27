package com.sap.interview;

public class StringExample1
{
    public static void main(String[] args)
    {
    	int number = 12;
    	String numberAsString = String.format ("%05d", number);
    	//System.out.println(numberAsString);
    	
    	String str = "In the following post I’ll introduce you to a basic UI test for a contact form. We will testing with Jest and Puppeteer. Even if it’s still under development and the API could be subject to changes, Puppeteer is here to stay. I was writing some tests last day and at the very same time I’ve come across a post by Kent C. Dodds."; 
    	System.out.println(str.length());
    
    }
}
