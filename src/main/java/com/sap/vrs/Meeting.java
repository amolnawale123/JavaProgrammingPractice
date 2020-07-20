package com.sap.vrs;

import java.util.Date;

public class Meeting {
	private Host host;
    private Visitor visitor;
    private Date date;
    private Purpose purpose;
	
    
    
    public Meeting(Host host, Visitor visitor, Date date, Purpose purpose) {
		super();
		this.host = host;
		this.visitor = visitor;
		this.date = date;
		this.purpose = purpose;
	}
    
    
	public Host getHost() {
		return host;
	}
	public void setHost(Host host) {
		this.host = host;
	}

	public Visitor getVisitor() {
		return visitor;
	}

	public void setVisitor(Visitor visitor) {
		this.visitor = visitor;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Purpose getPurpose() {
		return purpose;
	}

	public void setPurpose(Purpose purpose) {
		this.purpose = purpose;
	}
    
    
}
