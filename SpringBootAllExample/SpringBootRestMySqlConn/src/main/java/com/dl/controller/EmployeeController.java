package com.dl.controller;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
	
	@PostMapping("/saveemployees")
	public ResponseEntity<Employee> save(@RequestBody Employee emp){
		
		Employee employees = employeeService.saveEmployeeDetails(emp);
		
		return new ResponseEntity<Employee>(employees, HttpStatus.CREATED);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String> deleteEmployee(@PathVariable("id")  Integer id){
		
		   employeeService.deleteEmployeeDetails(id);
		
		
		return new ResponseEntity<>("Employee Record deleted", HttpStatus.OK);
		
	}
	
	
	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmployee(@PathVariable("id")Integer id, @RequestBody Employee employee){
		
		employee.setEmpId(id);
		
		Employee updateEmployee = employeeService.updateEmployeeDetails(employee);
		
		return new ResponseEntity<Employee>(updateEmployee, HttpStatus.OK);
	}
	
}

