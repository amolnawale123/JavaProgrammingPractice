package com.sap.arraylist;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;

public class RandomDateTime {

	public static void main(String[] args) {

		long rangebegin = Timestamp.valueOf("2018-11-01 00:00:00").getTime();
		long rangeend = Timestamp.valueOf("2018-11-10 00:00:00").getTime();
		long diff = rangeend - rangebegin + 1;
		Timestamp rand = new Timestamp(rangebegin + (long)(Math.random() * diff));
		SimpleDateFormat formater = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		System.out.println(formater.format(rand));
		
	}

}
