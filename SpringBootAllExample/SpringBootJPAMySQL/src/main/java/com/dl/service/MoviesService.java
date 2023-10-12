package com.dl.service;

import java.util.List;

import com.dl.model.TeluguMovies;

public interface MoviesService {
                                              // entity = tM
	public String createTeluguMovies(TeluguMovies tM);
	
	public String updateTeluguMovies(TeluguMovies tM);
	
	public String deleteTeluguMovies(int movieId);
	
	public TeluguMovies getTeluguMovies(int movieId);
	
	public List<TeluguMovies> getAllTeluguMovies();
	

	
	
	
}
