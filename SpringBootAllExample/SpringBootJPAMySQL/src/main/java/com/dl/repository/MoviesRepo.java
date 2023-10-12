package com.dl.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dl.model.TeluguMovies;

public interface MoviesRepo extends JpaRepository <TeluguMovies, Integer>{

}
