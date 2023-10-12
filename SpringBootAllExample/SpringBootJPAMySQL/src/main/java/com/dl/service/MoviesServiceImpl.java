package com.dl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dl.model.TeluguMovies;
import com.dl.repository.MoviesRepo;


@Service
public class MoviesServiceImpl implements MoviesService{

	
	@Autowired // ( injecting the beans and autowired is enabled at field level)
	MoviesRepo moviesRepository;
	
	
	
	
	// constructor of MoviesRepo
	public MoviesServiceImpl(MoviesRepo movieRepository) {
		super();
		this.moviesRepository = moviesRepository;
	}
	
	
	//CREATE = POST = save

	@Override
	public String createTeluguMovies(TeluguMovies tM) {
		
		//here whatever the data comes should be stored by this method
		moviesRepository.save(tM); // saved in entity 

		return "Created data successfully";
	}

	
	
	//UPDATE = PUT = save
	
	@Override
	public String updateTeluguMovies(TeluguMovies tM) {

		//whatever the data that user wants to update that should be done by this method
		moviesRepository.save(tM);
	
		return "successfully updated";
	}
	
	//DELETE = deleteById

	@Override
	public String deleteTeluguMovies(int movieId) {
		
		//here we want to delete the one that too by id 
		moviesRepository.deleteById(movieId);
		
		return "Deleted the data Successfully";
	}
	
	
	//GET means RETREIVE = findBYID

	@Override
	public TeluguMovies getTeluguMovies(int movieId) {
	 // get the particular  data by id  from database that too through the repository layer 
		
		moviesRepository.findById(movieId).get();
		
		return moviesRepository.findById(movieId).get();
	}

	@Override
	public List<TeluguMovies> getAllTeluguMovies() {
		
	//here whatever the data from database should get from database through repository layer
	
		return moviesRepository.findAll();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
