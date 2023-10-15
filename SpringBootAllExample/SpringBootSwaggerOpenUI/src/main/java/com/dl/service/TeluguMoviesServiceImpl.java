package com.dl.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dl.model.TeluguMovies;
import com.dl.repository.TeluguMoviesRepo;


@Service
public class TeluguMoviesServiceImpl implements TeluguMoviesService{

	 @Autowired// injecting the beans 
	 private  TeluguMoviesRepo mysql;
	 
	
	// GET ALL THE TELUGUMOVIES DATA FROM DATABASE
	@Override
	public List<TeluguMovies> findAllTeluguMoviesData() {
	
		
		return mysql.findAll();
	}

	
	
	//UPDATE TELUGUMOVIES DATA BY USING ID
	@Override
	public TeluguMovies updateTeluguMoviesData(TeluguMovies tM) {
		
	TeluguMovies updateTm	= mysql.findById(tM.getMovieId()).get();
	    updateTm.setMovieName(tM.getMovieName());
		updateTm.setMovieHero(tM.getMovieHero());
		updateTm.setMovieHeroine(tM.getMovieHeroine());
		updateTm.setMovieDirector(tM.getMovieDirector());
		updateTm.setMovieBudget(tM.getMovieBudget());
		updateTm.setMovieReleaseYear(tM.getMovieReleaseYear());
	
	TeluguMovies save = mysql.save(updateTm);
		return save;
	}

	
	//DELETE TELUGUMOVIES DATA BY USING ID
	@Override
	public void deleteTeluguMoviesData(Integer movieId) {
		
		mysql.deleteById(movieId);
		
	}

	
	// CREATE AND SAVE TELUGU MOVIES INTO DATABASE FROM USER ENTRY
	@Override
	public TeluguMovies save(TeluguMovies tM) {
		mysql.save(tM);
		return tM;
	}

	
	
	
	
	
	// use below link to get swagger documentation for this application
	//http://localhost:8080/swagger-ui/index.html?configUrl=/v3/api-docs/swagger-config#/telugu-movies-controller/getAllTeluguMoviesData
	
	
	
	
	
}
