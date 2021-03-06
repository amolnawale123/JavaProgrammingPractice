package com.sap.interview;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class JavaDateAddExample {

	public static void main(String[] args) {

		 // get a calendar instance, which defaults to "now"
	    Calendar calendar = Calendar.getInstance();
	    
	    // get a date to represent "today"
	    Date today = calendar.getTime();
	    System.out.println("today:    " + today);
	 
	    // add one day to the date/calendar
	    calendar.add(Calendar.DAY_OF_YEAR, 1);
	    
	    // now get "tomorrow"
	    Date tomorrow = calendar.getTime();

	    // print out tomorrow's date
	    System.out.println("tomorrow: " + tomorrow);
	    SimpleDateFormat formater = new SimpleDateFormat("MMM dd, yyyy");
		System.out.println(formater.format(tomorrow));
		
	}

}
