package com.my.locateemployee;


public class Employee {
	private String id;
	private String name;
	private String designation;
	private String phone;
	private String mail;
	private String reportingId;
	private String reporting;
	
	public Employee(String id, String name, String designation, String phone, String mail,String reportingId,String reporting) {
		this.id = id;
		this.name = name;
		this.designation= designation;
		this.phone=phone ;
		this.mail=mail;
		this.reportingId=reportingId;
		this.reporting=reporting;
	}
	
	public String getId() { return id; }
	public String getName() { return name; }
	public String getDesignation() { return designation; }
	public String getPhone() { return phone; }
	public String getMail() { return mail; }	
	public String getReportingId(){
		return reportingId;
	}
	public String getReporting(){
		return reporting;
	}
		
}