package com.dl.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dl.model.TeluguMovies;

@Repository
public interface TeluguMoviesRepo  extends JpaRepository <TeluguMovies, Integer> {

	
	
}
