package com.dl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dl.model.MovieDetails;

import java.util.ArrayList;
import java.util.List;
@RestController
public class MovieDetailsController {

	private List<MovieDetails> movieDetails = new ArrayList<>(); 
	
	
	@GetMapping("/movieDetails")
	public List<MovieDetails> southMovies(){
		
		MovieDetails md1 = new MovieDetails();
		md1.setMovieId(1);
		md1.setMovieName("Pokiri");
		md1.setMovieHero("MaheshBabu");
		md1.setMovieHeroine("Illeana");
		md1.setMovieBudget(20000000.00);
		md1.setMovieReleaseDate("2007");
		
		MovieDetails md2 = new MovieDetails();
		md2.setMovieId(1);
		md2.setMovieName("Okkadau");
		md2.setMovieHero("MaheshBabu");
		md2.setMovieHeroine("Trisha");
		md2.setMovieBudget(45000000.00);
		md2.setMovieReleaseDate("2005");
		
		movieDetails.add(md1);
		movieDetails.add(md2);
		
		return movieDetails;
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
}
