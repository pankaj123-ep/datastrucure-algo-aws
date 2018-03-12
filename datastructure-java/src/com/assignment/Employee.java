package com.assignment;

public class Employee {
	
	/*
	 *Employee instance variabl
	 *empid,firstName,lastName,emailid 
	
	*/
	int empId;

	public int getEmpId() {
		return empId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	String firstName;
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	String lastName;
	String emailId;
	
	//initialize instance variable
	Employee(int empId,String firstName,String lastName,String emailId)
	{
		this.empId=empId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailId=emailId;
		
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", emailId="
				+ emailId + "]";
	}
	
	
	

}
