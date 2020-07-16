package com.example.demo;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieInterface extends CrudRepository<Movie, Integer>{
	List<Movie> findByIsAdult(int isAdult);
	List<Movie> findByStartYear(int startYear);
	List<Movie> findByPrimaryTitle(String title);
}
