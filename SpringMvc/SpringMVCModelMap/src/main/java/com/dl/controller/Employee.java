package com.dl.controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class Employee {
	
	
	@RequestMapping(value="/employeePage") // method mapping
	public String employeeDetails(ModelMap model) {
		
		        model.addAttribute("id", "101");
		        model.addAttribute("firstName", "Mutyam");
		        model.addAttribute("lastName", "Bhargav");
		        model.addAttribute("contact", 9550357450L);
		        model.addAttribute("location", "Hyderabad");
	
		return "employeeDetails" ;
		
		
	}
	
	
	
	
	

}
