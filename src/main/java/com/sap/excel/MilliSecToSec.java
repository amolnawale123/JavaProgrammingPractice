package com.sap.excel;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

public class MilliSecToSec {
	
	public static void main(String[] args) {
		long executionTime = 471770;
		//long minutes = (executionTime / 1000)  / 60;
		
		long hours = TimeUnit.MILLISECONDS.toHours(executionTime);
		long minutes = TimeUnit.MILLISECONDS.toMinutes(executionTime);
		long remMinutes = hours%(60*60);
		long seconds = TimeUnit.MILLISECONDS.toSeconds(executionTime);
		long remSeconds = seconds % 60;
		
		System.out.println(hours);
		System.out.println(minutes);
		System.out.println(remMinutes);
		System.out.println(seconds);
		System.out.println(remSeconds);
		
		//System.out.println(hours+" hours,"+remMinutes+ "mins,"+remSeconds+ "seconds");
		
		
		long hours1 = TimeUnit.MILLISECONDS.toHours(executionTime);
		executionTime -= TimeUnit.HOURS.toMillis(hours1);
        long minutes1 = TimeUnit.MILLISECONDS.toMinutes(executionTime);
        executionTime -= TimeUnit.MINUTES.toMillis(minutes1);
        long seconds1 = TimeUnit.MILLISECONDS.toSeconds(executionTime);
		
        System.out.println(hours1+" hours,"+minutes1+ "mins,"+seconds1+ "seconds");
        
        
		//System.out.println(LocalTime.MIN.plusSeconds(executionTime).toString());
		
		//Duration elapsedTime = Duration.ofMillis(executionTime );
		//Calendar cal = Calendar.getInstance();
		//cal.set(5,(int)(executionTime/1000));
		//System.out.println(""+cal.HOUR+""+cal.MINUTE+""+cal.SECOND);
	    /*String humanReadableElapsedTime = String.format(
	            "%d hours, %d mins, %d seconds",
	            elapsedTime.toHours(),
	            elapsedTime.toMinutes(),
	            elapsedTime.);
	    
	    System.out.println(humanReadableElapsedTime);*/
	}
}
