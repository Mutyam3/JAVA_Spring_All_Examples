package com.dl.service;

import java.util.List;


import com.dl.model.TeluguMovies;

public interface TeluguMoviesService  {

	List<TeluguMovies> findAllTeluguMoviesData();
	
	TeluguMovies updateTeluguMoviesData(TeluguMovies tM);
	
	void deleteTeluguMoviesData(Integer movieId);
	
	TeluguMovies save(TeluguMovies tM);
	
}
