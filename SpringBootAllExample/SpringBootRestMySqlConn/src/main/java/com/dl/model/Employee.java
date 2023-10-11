package com.dl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//import javax.persistence.Entity; // from javax dependencies add dependency in pom.xml
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.Table; // from this we are getting error so we shift to jakarata

@Entity
@Table(name="employeeDetails")
public class Employee {
	
	
	@Id // automatically generate primary key for us
	@GeneratedValue(strategy  = GenerationType.IDENTITY )

	//properties | fields
	
	private int empId;
	private String empFirstName;
	private String empLastName;
	private long empContact;
	private String empAddress;
	private String empLocation;
	private String empJobRole;
	private double empSalary;
	
	
	
	//Setters and getters
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpFirstName() {
		return empFirstName;
	}
	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}
	public String getEmpLastName() {
		return empLastName;
	}
	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}
	public long getEmpContact() {
		return empContact;
	}
	public void setEmpContact(long empContact) {
		this.empContact = empContact;
	}
	public String getEmpAddress() {
		return empAddress;
	}
	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
	}
	public String getEmpLocation() {
		return empLocation;
	}
	public void setEmpLocation(String empLocation) {
		this.empLocation = empLocation;
	}
	public String getEmpJobRole() {
		return empJobRole;
	}
	public void setEmpJobRole(String empJobRole) {
		this.empJobRole = empJobRole;
	}
	public double getEmpSalary() {
		return empSalary;
	}
	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	 // default constructor 
	public Employee() {
		
	}
	
	// constructors using fields
	
	public Employee(int empId, String empFirstName, String empLastName, long empContact, String empAddress,
			String empLocation, String empJobRole, double empSalary) {
		super();
		this.empId = empId;
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.empContact = empContact;
		this.empAddress = empAddress;
		this.empLocation = empLocation;
		this.empJobRole = empJobRole;
		this.empSalary = empSalary;
	}
	// toString method
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empLastName=" + empLastName
				+ ", empContact=" + empContact + ", empAddress=" + empAddress + ", empLocation=" + empLocation
				+ ", empJobRole=" + empJobRole + ", empSalary=" + empSalary + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
