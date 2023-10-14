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

	@Override
	public Employee saveEmployeeDetails(Employee emp) {
		mysql.save(emp);
		
		return emp; 
	}

	@Override
	public Employee updateEmployeeDetails(Employee emp) {
	
		Employee empUpdate = mysql.findById(emp.getEmpId()).get();
		              
		empUpdate.setEmpFirstName(emp.getEmpFirstName());  
		empUpdate.setEmpLastName( emp.getEmpLastName());         
		empUpdate.setEmpContact( emp.getEmpContact());         
		empUpdate.setEmpAddress(emp.getEmpAddress());        
		empUpdate.setEmpLocation(emp.getEmpLocation());         
		empUpdate.setEmpSalary(emp.getEmpSalary());        
		
		Employee save = mysql.save(emp);         
		return save;
	}

	@Override
	public void deleteEmployeeDetails(Integer id) {
		
		mysql.deleteById(id);

	}

}
