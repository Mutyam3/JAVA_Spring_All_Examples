package com.dl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dl.service.EmployeeService;
import com.dl.model.Employee;
import java.util.List;


@RestController
@RequestMapping("/TechCompany")
public class EmployeeController {

	@Autowired
	public EmployeeService employeeService;
	
	
	@GetMapping("/Employees")
	public  ResponseEntity<List<Employee>>get(){
		
		 List<Employee> findAllEmployees = employeeService.findAllEmployeeDetails();
		
		return new ResponseEntity<List<Employee>>(findAllEmployees, HttpStatus.OK);
		
	}
	
}
