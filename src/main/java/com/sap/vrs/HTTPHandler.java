package com.sap.vrs;

import org.json.*;
import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Base64;

public class HTTPHandler {
	private String baseURL;

	public HTTPHandler(String baseUrl) {
		this.baseURL = baseUrl;
	}

	
	public String getAccessToken(String appKey, String appSecret) throws MalformedURLException, IOException {
		String token_url = this.baseURL + "/oauth/token";
		// Encode your App Key and App Secret in Base64
		String credentials = appKey + ":" + appSecret;
		String credentialsEncoded = Base64.getEncoder().encodeToString(credentials.getBytes());
		String param = "grant_type=client_credentials";
		String authTokenJsonString = this.postForAccessToken(token_url, param, credentialsEncoded);
		JSONObject object = new JSONObject(authTokenJsonString);
		return object.getString("access_token");
	}

	public String postForAccessToken(String path, String data, String authenticationToken)
			throws MalformedURLException, IOException {
		URL url = new URL(path);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
		connection.setRequestProperty("Accept", "application/json");
		connection.setRequestProperty("Authorization", "Basic " + authenticationToken);
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

	public void sendSMS(String message, String destination, String authenticationToken) {
		JSONObject postBody = new JSONObject().put("message", message).put("destination", destination);
		String url = this.baseURL + "/v2/sms";
		try {
			this.post(url, postBody.toString(), authenticationToken);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// This is a method that does an http post, given the path/url, data (a json
	// string).
	public String post(String path, String data, String authenticationToken) throws MalformedURLException, IOException {
		URL url = new URL(path);
		HttpURLConnection connection = (HttpURLConnection) url.openConnection();
		connection.setRequestMethod("POST");
		connection.setRequestProperty("Content-Type", "application/json; charset=UTF-8");
		if (authenticationToken != null && !authenticationToken.isEmpty()) {
			connection.setRequestProperty("Authorization", "Bearer " + authenticationToken);
		}
		//System.out.println(authenticationToken);
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