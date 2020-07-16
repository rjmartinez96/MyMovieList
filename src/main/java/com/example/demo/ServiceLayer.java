package com.example.demo;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceLayer {

	@Autowired
	private MovieInterface mi;
	
	public Movie getMovie(int id) {
		Optional<Movie> movOp = mi.findById(id);
		Movie mov = new Movie();
		if(movOp.isPresent()) mov = movOp.get();
		return mov;
	}
	
	public List<Movie> getAdultMovies(int is_adult){
		return mi.findByIsAdult(is_adult);
	}
	
	public List<Movie> getMoviesByYear(int year){
		return mi.findByStartYear(year);
	}
}
