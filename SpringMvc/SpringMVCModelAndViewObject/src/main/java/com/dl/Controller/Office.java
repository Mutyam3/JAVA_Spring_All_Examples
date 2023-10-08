package com.dl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class Office {

	@RequestMapping("/employeeDetailsPage")
	public ModelAndView employeeDetails() {
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("employeeDetails");
		mav.addObject("empId", 101);
		mav.addObject("empFisrtName","Mutyam");
		mav.addObject("empLastName", "Bhargav");
		mav.addObject("empContactNumber", 9854715628L);
		mav.addObject("empLocation", "HYD");
		
		return mav;
	}
}
