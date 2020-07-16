package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestServiceofMovie {

	@Autowired
	private ServiceLayer sl;
	
	@RequestMapping(value="/getdataobjectofmovie/id={id}", method=RequestMethod.GET)
	public Movie getMov(@PathVariable("id") Integer id) {
		return sl.getMovie(id);
	}
	
	@RequestMapping(value="/getlistofmovies/isadult={adult}", method=RequestMethod.GET)
	public List<Movie> getAdultList(@PathVariable("adult") Integer isAdult) {
		return sl.getAdultMovies(isAdult);
	}
	
	@RequestMapping(value="/getlistofmovies/year={year}", method=RequestMethod.GET)
	public List<Movie> getStartYearList(@PathVariable("year") Integer year) {
		return sl.getMoviesByYear(year);
	}
}
