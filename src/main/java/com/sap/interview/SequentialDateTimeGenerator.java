package com.sap.interview;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SequentialDateTimeGenerator {

	public static void main(String[] args) throws ParseException {
		String start = "01-Nov-2018 00:00:00";
		String end = "10-Nov-2018 23:59:59";
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
		Date diffedDate = dateFormat.parse(start);
		Date endDate = dateFormat.parse(end);
		while (diffedDate.compareTo(endDate) < 0) {
			long diff = 1000; // milliseconds!
			diffedDate = new Date(diffedDate.getTime() + diff);
			System.out.println(dateFormat.format(diffedDate));
		}

	}

}
