package Test;

import java.io.IOException;
import Test.HttpHandler;

public class TestSMS {

	public static void main(String[] args) {
		
		//See below examples of how to set the json to be sent.
		
		//Make sure to escape all double quotes inside the json, only the outer quotes for each string should be left unescaped.
		
		String params1 = "{"
			+" \"body\": \"test from java 1\","
			+" \"channel\": \"SMS\","
			+" \"origin\": \"919731059280 \","
			+" \"destination\": [\"919823805739\"],"
			+" \"callback\": \"http://teste.com\""
			+"}";
		
		String params2 = "{"
				+" \"body\": \"test from java 2\","
				+" \"channel\": \"SMS\","
				+" \"origin\": \"919731059280 \","
				+" \"destination\": [\"16502293868\", \"17032228653\"]," //example with two numbers
				+" \"callback\": \"http://teste.com\""
				+"}";
		
		String params3 = "{"
				+" \"body\": \"test from java 3\","
				+" \"channel\": \"SMS\","
				+" \"origin\": \"919731059280 \","
				+" \"destination\": [\"16502293868\"],"
				+" \"callback\": \"http://teste.com\""
				+"}";
		
		String url = "http://llbpal56.pal.sap.corp:15200/accounts/1/messages";
		try {
			HttpHandler.post(url, params1); //This function has been implemented in the HttpHandler class, which should be included in the project.
			//HttpHandler.post(url, params2);
			//HttpHandler.post(url, params3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
