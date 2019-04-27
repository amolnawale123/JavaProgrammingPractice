package com.sap.oops;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class XML2String {

	public static void main(String[] args) throws IOException {
		String filename = System.getProperty("user.dir") + "/src/main/java/com/sap/oops/SendSMS.xml";
		BufferedReader br = new BufferedReader(new FileReader(new File(filename)));
		String line;
		StringBuilder sb = new StringBuilder();

		while((line=br.readLine())!= null){
		    sb.append(line.trim());
		}
		br.close();
		String xmlRequest = sb.toString();
		xmlRequest=xmlRequest.replace("^username^", "newUserName");
		xmlRequest=xmlRequest.replace("^password^", "newPassword");
		
		System.out.println(xmlRequest);
	}

}
