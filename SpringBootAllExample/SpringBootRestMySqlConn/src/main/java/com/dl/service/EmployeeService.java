package com.dl.service;

import java.util.List;

import com.dl.model.Employee;

public interface EmployeeService {

	
	
	List<Employee>findAllEmployeeDetails();

	Employee saveEmployeeDetails(Employee emp);
	
	Employee updateEmployeeDetails(Employee emp);
	
	void deleteEmployeeDetails(Integer id);
}
