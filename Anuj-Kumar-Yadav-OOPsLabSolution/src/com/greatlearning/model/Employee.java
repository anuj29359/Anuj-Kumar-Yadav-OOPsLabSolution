package com.greatlearning.model;

public class Employee {
	private String fName;
	private String lName;
	
	private String email;
	private String dept;
	private String password;
	private String company = "GreatLearning"; //hardcoded company name for simplicity
	
	// Parameterized constructor to create employee obj using fname, laname and department
	public Employee(String fName, String lName, String dept) {
		this.fName = fName;
		this.lName = lName;
		this.dept = dept;
	}
	
	// getter setter for all the data members
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	

}
