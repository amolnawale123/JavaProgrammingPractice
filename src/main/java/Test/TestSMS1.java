package Test;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;


public class TestSMS1 {

	public static void main(String[] args) {
		
		//See below examples of how to set the json to be sent.
		
		//Make sure to escape all double quotes inside the json, only the outer quotes for each string should be left unescaped.
		
		int ACCOUNT_NUMBER = 1; //substitute with your account number.
		
		String params1 = "{"
			+" \"body\": \"test from java 1\"," //Customize this string. It's the string that will be shown to the user.
			+" \"channel\": \"SMS\"," //Keep this as "SMS"
			+" \"origin\": \"919731059280\"," //Place here your origin phone number
			+" \"destination\": [\"919823805739\"]," //Place here the destination number(s)
			+" \"callback\": \"http://teste.com\"" //You can place this url with a callback url from your server, in order to receive replies.
			+"}";
		
		String url = "http://llbpal56.pal.sap.corp:15200/accounts/"+ACCOUNT_NUMBER+"/messages";
		try {
			post(url, params1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static String post(String path, String data) throws MalformedURLException, IOException {
        URL url = new URL(path);
        HttpURLConnection connection = (HttpURLConnection)url.openConnection();
        connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
		connection.setRequestProperty ("Authorization", "Bearer " + "ciDhIKwkxPp2nZCp8RpXgqVwBUo7EYdX");
        connection.setDoOutput(true);
        DataOutputStream writer = new DataOutputStream(connection.getOutputStream());
        writer.writeBytes(data);
        writer.flush();
        writer.close();
        InputStreamReader inputStreamReader = new InputStreamReader(connection.getInputStream());
        BufferedReader reader = new BufferedReader(inputStreamReader);
        StringBuilder response = new StringBuilder();
        String inputLine;
        while ((inputLine = reader.readLine()) != null)
            response.append(inputLine);
        reader.close();
        return response.toString();
    }

}