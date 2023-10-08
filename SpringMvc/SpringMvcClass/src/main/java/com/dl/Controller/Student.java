package com.dl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/studentpage")
public class Student {
      
	@RequestMapping()
	public ModelAndView studentDetails() {
	  ModelAndView mav = new ModelAndView(); //creates an object
	  mav.setViewName("student");// Movies.jsp
	
	 return mav;
	
	
	}
	
	
	
	
}
