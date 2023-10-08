package com.dl.model;

public class StudentInfo {
	
	
	private int studentId;
	private String firstName;
	private String lastName;
	private long contactNumber;
	private String location;
	
	public StudentInfo() {
		
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public long getContactNumber() {
		return contactNumber;
	}

	public void setContactNumber(long contactNumber) {
		this.contactNumber = contactNumber;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public StudentInfo(int studentId, String firstName, String lastName, long contactNumber, String location) {
		super();
		this.studentId = studentId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.contactNumber = contactNumber;
		this.location = location;
	}

	@Override
	public String toString() {
		return "StudentInfo [studentId=" + studentId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", contactNumber=" + contactNumber + ", location=" + location + "]";
	}
	
	

}
