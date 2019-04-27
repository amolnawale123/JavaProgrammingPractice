package testProject.testProject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.apache.log4j.Logger;

public class GetCurrentDateTime {
  public static void main(String[] args) {

	  final Logger logger = Logger.getLogger(GetCurrentDateTime.class);

	   DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	   //get current date time with Date()
	   Date date = new Date();
	   //System.out.println(dateFormat.format(date));
	   logger.debug("The Date is: "+ dateFormat.format(date));

	   //get current date time with Calendar()
	   Calendar c = Calendar.getInstance();
	   //System.out.println(dateFormat.format(c.getTime()));
	   logger.debug("The Date is: "+ dateFormat.format(c.getTime()));
	   //c.setTime(date); 
	   c.add(Calendar.DATE, 5);
	  // System.out.println(dateFormat.format(c.getTime()));
	   logger.debug("The Date is : "+ dateFormat.format(c.getTime()));
	   
	   //date = c.getTime();
	   //System.out.println(date);


  }
}
