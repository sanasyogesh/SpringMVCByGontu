package org.practice.model;

import java.util.ArrayList;
import java.util.Date;

import jakarta.validation.constraints.Size;

public class Student {

	@Size(min = 3, max = 30, message = "First Name Length Should be Between 3 to 30." )
	private String userName;
	private String password;
	private long mobile;
	private Date dob;	
	private ArrayList<String> skillSets;
	private Address studentAddress;
		
	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public long getMobile() {
		return mobile;
	}
	public void setMobile(long mobile) {
		this.mobile = mobile;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public ArrayList<String> getSkillSets() {
		return skillSets;
	}
	public void setSkillSets(ArrayList<String> skillSets) {
		this.skillSets = skillSets;
	}
	public Address getStudentAddress() {
		return studentAddress;
	}
	public void setStudentAddress(Address studentAddress) {
		this.studentAddress = studentAddress;
	}
		
}
