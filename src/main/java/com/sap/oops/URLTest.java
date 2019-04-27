package com.sap.oops;

public class URLTest {
	private String appName, url, status;

	URLTest() {

	}

	URLTest(String appName, String url, String status) {
		this.appName = appName;
		this.url = url;
		this.status = status;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
