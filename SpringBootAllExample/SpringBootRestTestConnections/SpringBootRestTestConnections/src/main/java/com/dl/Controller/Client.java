package com.dl.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// these annotations are RestAPI SpringBoot application
@RestController
@RequestMapping("/client") // annotation at class level
public class Client {

	@GetMapping("/get") // get the data from user //these all are end points
	public String getUser() {
		
		
		return "get method Invoked";
	}
	
	@PostMapping("/post") // posting the data  //end point
	public String createUser() {
		
		
		
		return "post method Invoked";
	}
	
	@PutMapping("/update")    //end point
	public String updateMethod() {
		
		
		return "update Method Invoked";
		
	}
	
	@DeleteMapping("/del")     // end point
	public String deleteMethod() {
		
		return "Delete Method Invoked";
		
	}
	
	@RequestMapping("/methodlevel") // we can apply requestMapping on class level and also method level.. here I given requestMapping at method level
	// we even can apply requestMapping at return however don't require requestMapping at return level in spring boot application
	public String helloworld() {
		
		return "Method Level Invoked";	
	}
	
	// always use postman to test RestApi ....in browser u can only check get not put , post, del so we should go for postman 
    
}
