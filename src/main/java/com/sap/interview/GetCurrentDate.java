package com.sap.interview;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;

public class GetCurrentDate {

	public static void main(String[] args) {

		Date date = new Date();
		System.out.println(date);
		SimpleDateFormat formater = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		System.out.println(formater.format(date));
		
		LocalDateTime dt = LocalDateTime.now();
		LocalDate d = LocalDate.now();
		LocalTime t = LocalTime.now();
		System.out.println(dt);
		System.out.println(d);
		System.out.println(t);
		
	}

}
