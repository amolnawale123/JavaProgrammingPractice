package com.sap.vrs;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

public class MeetingManager {

	static Properties config;
    public static Properties loadProperties(String filePath) throws IOException {
        Properties prop = new Properties();
        
        try {
        	FileInputStream ip = new FileInputStream(filePath);
        	prop.load(ip);
        	
        } catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
        return prop;
    }
	
	public static void main(String[] args) throws MalformedURLException, IOException, ParseException, InterruptedException  {
        Visitor visitor = new Visitor(); 
        Host host = new Host(); 
        Purpose purpose = new Purpose();
        Date bookingDate = null;
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmm");
        String date = "";
        String time = "";
        
        int visitorId = 0;
        int hostId = 0;
      
        config = loadProperties(System.getProperty("user.dir") + "/src/main/java/com/sap/vrs/config.properties");

        visitor.setVisitorID(visitorId++);
        visitor.setVisitorFirstName(config.getProperty("visitor_firstname"));
        visitor.setVisitorLastName(config.getProperty("visitor_lastname"));
        visitor.setVisitorPhoneNumber(Long.parseLong(config.getProperty("visitor_phonenumber")));
        
        host.setHostID(hostId++);
        host.setHostFirstName(config.getProperty("host_firstname"));
        host.setHostLastName(config.getProperty("host_lastname"));
        host.setHostPhoneNumber(Long.parseLong(config.getProperty("host_phonenumber")));
        
        purpose.setPurposeOfVisit(config.getProperty("purpose_of_visit"));
        
        date = config.getProperty("date");
        time = config.getProperty("time");
        bookingDate = formatter.parse(date + time);

        Meeting meeting = new Meeting(host, visitor, bookingDate, purpose);
       
        String visitorName = meeting.getVisitor().getVisitorFullName();
        String hostName = meeting.getHost().getHostFullName();
        String purposeOfVisit = meeting.getPurpose().getPurposeOfVisit();
        Date meetingDate = meeting.getDate();
        
        
        // _Step_9
        String notifMessage = "Hello " + hostName + ", you have a visitor " + visitorName + " checked-in at the reception desk. Purpose of the visit : "+purposeOfVisit;
        String welcomeMessage = "Welcome to SAP " + visitorName + " .Please wait for a short while until your host " + hostName + " attends you.";
        String appKey = config.getProperty("appKey"); 
        String appSecret = config.getProperty("appSecret"); 
        String hostNumber = config.getProperty("host_phonenumber"); 
        String visitorNumber = config.getProperty("visitor_phonenumber"); 
        String baseUrl = config.getProperty("baseUrl"); 
        HTTPHandler handler = new HTTPHandler(baseUrl);
        // Send Welcome Message to the Visitor
        System.out.println("Welcome Message => "+welcomeMessage);
        handler.sendSMS(welcomeMessage, visitorNumber, handler.getAccessToken(appKey, appSecret));
        
        Thread.sleep(2000);
        // Send Message to the Host
        System.out.println("Notif Message to the Host => "+notifMessage);
        handler.sendSMS(notifMessage, hostNumber, handler.getAccessToken(appKey, appSecret));
    }
}
