package com.bday.vo;

import java.util.Date;

public class Employee {
	
	private String name;
	private String spouseName;
	private String bday;
	private String annivDate;
	private String joiningDate;
	
	public Employee(){
		
	}
	public Employee(String name, String spouseName)
	{
		super();
		this.name = name;
		this.spouseName = spouseName;
		
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSpouseName() {
		return spouseName;
	}

	public void setSpouseName(String spouseName) {
		this.spouseName = spouseName;
	}

	public String getBday() {
		return bday;
	}

	public void setBday(String bday) {
		this.bday = bday;
	}

	public String getAnnivDate() {
		return annivDate;
	}

	public void setAnnivDate(String annivDate) {
		this.annivDate = annivDate;
	}

	public String getJoiningDate() {
		return joiningDate;
	}

	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	
}
