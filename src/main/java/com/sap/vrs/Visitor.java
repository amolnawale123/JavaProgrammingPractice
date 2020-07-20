package com.sap.vrs;

public class Visitor {
	private int visitorID;
	private String visitorFirstName;
	private String visitorLastName;
	private Long visitorPhoneNumber;

	public int getVisitorID() {
		return visitorID;
	}

	public void setVisitorID(int visitorID) {
		this.visitorID = visitorID;
	}

	public String getVisitorFirstName() {
		return visitorFirstName;
	}

	public void setVisitorFirstName(String visitorFirstName) {
		this.visitorFirstName = visitorFirstName;
	}

	public String getVisitorLastName() {
		return visitorLastName;
	}

	public void setVisitorLastName(String visitorLastName) {
		this.visitorLastName = visitorLastName;
	}

	public Long getVisitorPhoneNumber() {
		return visitorPhoneNumber;
	}

	public void setVisitorPhoneNumber(Long visitorPhoneNumber) {
		this.visitorPhoneNumber = visitorPhoneNumber;
	}

	public String getVisitorFullName() {
		return getVisitorFirstName()+" "+getVisitorLastName();
	}
}
