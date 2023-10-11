package com.dl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dl.model.Employee;
import com.dl.repository.EmployeeRepository;

// In service layer we write business logic 
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	// data member
	private EmployeeRepository mysql;
	
	public List<Employee> findAllEmployeeDetails(){
		
		return mysql.findAll();
	}

}
