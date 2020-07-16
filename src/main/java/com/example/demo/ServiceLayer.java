package com.example.demo;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
		List<Movie> temp = mi.findByIsAdult(is_adult);
		if(temp.isEmpty()) temp = new ArrayList<Movie>();
		return temp;
	}
	
	public List<Movie> getMoviesByYear(int year){
		List<Movie> temp = mi.findByStartYear(year);
		if(temp.isEmpty()) temp = new ArrayList<Movie>();
		return temp;
	}
	
	public List<Movie> getMovieByTitle(String title) {
		List<Movie> temp = mi.findByPrimaryTitle(title);
		if(temp.isEmpty()) temp = new ArrayList<Movie>();
		return temp;
	}
}
