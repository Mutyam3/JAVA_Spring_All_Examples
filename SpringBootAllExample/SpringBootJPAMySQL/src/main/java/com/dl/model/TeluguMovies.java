package com.dl.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TeluguMovies")
public class TeluguMovies {

	//Fields
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY )
	private int movieId;
	private String movieName;
	private String movieHero;
	private String movieHeroine;
	private String movieDirector;
	private double movieBudget;
	private String movieReleaseYear;
	
	
	
	//setters and getters
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getMovieName() {
		return movieName;
	}
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	public String getMovieHero() {
		return movieHero;
	}
	public void setMovieHero(String movieHero) {
		this.movieHero = movieHero;
	}
	public String getMovieHeroine() {
		return movieHeroine;
	}
	public void setMovieHeroine(String movieHeroine) {
		this.movieHeroine = movieHeroine;
	}
	public String getMovieDirector() {
		return movieDirector;
	}
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	public double getMovieBudget() {
		return movieBudget;
	}
	public void setMovieBudget(double movieBudget) {
		this.movieBudget = movieBudget;
	}
	public String getMovieReleaseYear() {
		return movieReleaseYear;
	}
	public void setMovieReleaseYear(String movieReleaseYear) {
		this.movieReleaseYear = movieReleaseYear;
	}
	
	//default constructor
	public TeluguMovies() {
		
	}
	
	// parameterized constructor
	public TeluguMovies(int movieId, String movieName, String movieHero, String movieHeroine, String movieDirector,
			double movieBudget, String movieReleaseYear) {
		super();
		this.movieId = movieId;
		this.movieName = movieName;
		this.movieHero = movieHero;
		this.movieHeroine = movieHeroine;
		this.movieDirector = movieDirector;
		this.movieBudget = movieBudget;
		this.movieReleaseYear = movieReleaseYear;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
