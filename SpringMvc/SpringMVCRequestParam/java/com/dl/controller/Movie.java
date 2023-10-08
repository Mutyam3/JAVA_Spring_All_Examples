package com.dl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/IndianMovies")
public class Movie {


	//@RequestMapping(value="/TFIMovies" , method = RequestMethod.GET)
	@RequestMapping(value="/TFIMovies/{movieId}/{movieName}/{movieHero}/{movieHeroine}/{movieBudget}",method = RequestMethod.GET)//PathVariable
	public ModelAndView movieDetails(
			@RequestParam(value ="movieId" , defaultValue = "101") int movieId ,
			@RequestParam(value ="movieName" , defaultValue = "GunturKaram")String movieName,
			@RequestParam(value ="movieHero", defaultValue= "MaheshBabu")String movieHero,
			@RequestParam(value = "movieHeroine", defaultValue= "Sreeleela") String movieHeroine,
			@RequestParam(value = "movieBudget" ,defaultValue ="100")long movieBudget)
	 {
		
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("movieDetails");
		mav.addObject("movieId", movieId);
		mav.addObject("movieName",movieName);
		mav.addObject("movieHero", movieHero);
		mav.addObject("movieHeroine", movieHeroine);
		mav.addObject("movieBudget", movieBudget);
		
		
		System.out.println(movieId);
		System.out.println(movieName);
		System.out.println(movieHero);
		System.out.println(movieHeroine);
		System.out.println(movieBudget);
		
	
		
		return mav;
	
	
	
	
	}
	
	
	
	
	
	
	
	
}
