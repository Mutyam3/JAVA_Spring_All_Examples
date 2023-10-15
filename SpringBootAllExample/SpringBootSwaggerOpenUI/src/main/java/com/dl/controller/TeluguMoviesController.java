package com.dl.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dl.model.TeluguMovies;
import com.dl.service.TeluguMoviesService;


@RestController
@RequestMapping("/SouthMovies/TeluguMovies")
public class TeluguMoviesController {

	@Autowired
	TeluguMoviesService tMService;
	
	
	//Create method 
	@PostMapping("/saveData")
	public ResponseEntity<TeluguMovies> createTeluguMoviesData(@RequestBody TeluguMovies tM) {
		
	TeluguMovies teluguMovies	= tMService.save(tM);
		
		return new ResponseEntity<TeluguMovies>(teluguMovies, HttpStatus.CREATED);
	
	}
	
	@GetMapping("/getData")
	//Get all the TeluguMovies data 
	
	public ResponseEntity<List<TeluguMovies>> getAllTeluguMoviesData(){
		
		List<TeluguMovies> getAll = tMService.findAllTeluguMoviesData();
		

		return new ResponseEntity<List<TeluguMovies>>(getAll, HttpStatus.OK);
		
		
	}
	
	
	//Update TeluguMoviesData by id
	@PutMapping("/update/{id}")
	public ResponseEntity<TeluguMovies> updateTeluguMovies(@PathVariable("id")Integer id, @RequestBody TeluguMovies tM){
		
	   tM.setMovieId(id);
	   TeluguMovies updateTeluguMovies	= tMService.updateTeluguMoviesData(tM);
		
	
		return new ResponseEntity<TeluguMovies>(updateTeluguMovies, HttpStatus.OK);
		
	}
	
	
	
	//Delete the teluguMovies data using id
	@DeleteMapping("/delete/{id}")
	
	public ResponseEntity <String> deleteTeluguMovies(@PathVariable("id")  Integer movieId){
		
	tMService.deleteTeluguMoviesData(movieId);
	
	return new ResponseEntity<>("TeluguMovies Data Deleted Successfully", HttpStatus.OK);
	
}
	
}
