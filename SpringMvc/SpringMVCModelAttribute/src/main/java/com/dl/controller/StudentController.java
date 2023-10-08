package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.dl.model.StudentInfo;

@Controller
@RequestMapping("/")
public class StudentController {
	
	
	@RequestMapping(value= "/" , method = RequestMethod.GET)
	public String studentRegistrationForm() {
		
		return "index";// index.jsp
		
	}
	
	@RequestMapping(value = "/studentValues", method = RequestMethod.POST) //here we are sending the data
	public ModelAndView studentValues (@ModelAttribute("studentInfo")StudentInfo  studentInfo) { // it creates object for us.. (studentInfo) and its equivalent to Requestparam.
		
		
		
        ModelAndView mav = new ModelAndView("studentForm"); //view resolver // jsp
        mav.addObject("studentInfo", studentInfo); //should pass in jsp expression language
        
        
        
          return mav;
	}
}
