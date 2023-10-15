package com.dl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TeluguMovies")
public class TeluguMovies {

	
	//properties
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int movieId;
	private String movieName;
	private String movieHero;
	private String movieHeroine;
	private String movieDirector;
	private double movieBudget;
	private String movieReleaseYear;
	
	public TeluguMovies() {
		
	}
	
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
	
	
//	
//	//to string method
	@Override
	public String toString() {
		return "TeluguMovies [movieId=" + movieId + ", movieName=" + movieName + ", movieHero=" + movieHero
				+ ", movieHeroine=" + movieHeroine + ", movieDirector=" + movieDirector + ", movieBudget=" + movieBudget
				+ ", movieReleaseDate=" + movieReleaseYear + "]";
	}
	
	
	
	
	
	
}
