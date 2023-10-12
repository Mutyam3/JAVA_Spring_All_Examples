package com.dl.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import com.dl.model.TeluguMovies;
import com.dl.service.MoviesService;



@RestController
@RequestMapping("/TeluguMovies")
public class MoviesController {

	@Autowired
	MoviesService moviesService;
	
	
	
	public MoviesController(MoviesService moviesService) {
		
		this.moviesService = moviesService;
	}


     @PostMapping
	public String createTeluguMovies(@RequestBody TeluguMovies Tm) {
		
		moviesService.createTeluguMovies(Tm);
		
		return "successfully created data into database";
		
	}
     
     // Update the data
     
	   @PutMapping()
      public String updateTeluguMovies(@RequestBody TeluguMovies Tm) {
    	  
    	  moviesService.updateTeluguMovies(Tm);
    	  
		return "Successfully updated the data";
    	  
      }
	
      
      //Read specific Telugu Movies details
      
      @GetMapping("{moviesId}")
	  public TeluguMovies getTeluguMovies(@PathVariable("moviesId")int moviesId ) {
		  
		  
		  
		return moviesService.getTeluguMovies(moviesId);
		  
	  }
	 
      //Read all Telugu Movies details
      @GetMapping()
      public List<TeluguMovies> getTeluguMovies() {
		  
		  
  		return moviesService.getAllTeluguMovies();
  		  
  	  }
      
      
      // Delete BYid
      @DeleteMapping("{moviesId}" )
      public String deleteTeluguMoviesa(@PathVariable(value="moviesId")int moviesId) {
		
    	  
      moviesService.deleteTeluguMovies(moviesId);
    	  
    	  
      return "Telugu Movie deleted successfully ";
		
    	  
      }
  	 
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
