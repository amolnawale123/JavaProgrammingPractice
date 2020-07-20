package com.sap.vrs;

public class Host {
	private int hostID;
	private String hostFirstName;
	private String hostLastName;
	private Long hostPhoneNumber;

	public int getHostID() {
		return hostID;
	}

	public void setHostID(int hostID) {
		this.hostID = hostID;
	}

	public String getHostFirstName() {
		return hostFirstName;
	}

	public void setHostFirstName(String hostFirstName) {
		this.hostFirstName = hostFirstName;
	}

	public String getHostLastName() {
		return hostLastName;
	}

	public void setHostLastName(String hostLastName) {
		this.hostLastName = hostLastName;
	}

	public Long getHostPhoneNumber() {
		return hostPhoneNumber;
	}

	public void setHostPhoneNumber(Long hostPhoneNumber) {
		this.hostPhoneNumber = hostPhoneNumber;
	}

	public String getHostFullName() {
		return getHostFirstName()+" "+getHostLastName();
	}
}
