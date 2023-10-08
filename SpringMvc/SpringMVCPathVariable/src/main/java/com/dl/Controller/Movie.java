package com.dl.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(value="/Indianmovies")
public class Movie {
	
	@RequestMapping(value="/SouthMovies/{movieId}/{movieName}/{movieHero}/{movieHeroine}/{movieBudget}", method = RequestMethod.GET)
	public ModelAndView MovieDetails(@PathVariable("movieId")String movieId, @PathVariable("movieName") String movieName, @PathVariable("movieHero")String movieHero, @PathVariable("movieHeroine") String movieHeroine, @PathVariable("movieBudget")String movieBudget){
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("movieDetails");  // jsp file name (movieDetails.jsp)
		mav.addObject("movieId" ,movieId);
		mav.addObject("movieName", movieName);
		mav.addObject("movieHero", movieHero);
		mav.addObject("movieHeroine", movieHeroine);
		mav.addObject("movieBudget", movieBudget);
		
		
		// to confirm whether its print so we done this to check in console
		System.out.println(movieId);
		System.out.println(movieName);
		System.out.println(movieHero);
		System.out.println(movieHeroine);
		System.out.println(movieBudget);
		
		return mav;
		
	}

}
