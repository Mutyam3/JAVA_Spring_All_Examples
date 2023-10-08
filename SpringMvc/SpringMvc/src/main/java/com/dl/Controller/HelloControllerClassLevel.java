package com.dl.Controller;

import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;




@Controller
@RequestMapping(value="/moviepage")
public class HelloControllerClassLevel {

	@RequestMapping(method=RequestMethod.GET)
	 public String movies(Model model) {
		 
		 
		 model.addAttribute("message", "New TFI movies release this month");
		 model.addAttribute("skanda", "Date:28-09-2023");
		 
		 return "movies"; // jsp file
	 }
	
	
	
	
	
	
}
