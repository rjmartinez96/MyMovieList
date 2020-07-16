package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "movies_titles_basics")
public class Movie {
	@Id
	private int tconst;
	@Column(name = "title_type")
	private String titleType;
	@Column(name = "primary_title")
	private String primaryTitle;
	@Column(name = "original_title")
	private String originalTitle;
	@Column(name = "is_adult")
	private int isAdult;
	@Column(name = "start_year")
	private int startYear;
	@Column(name = "end_year")
	private int endYear;
	@Column(name = "runtime_minutes")
	private int runtimeMinutes;
	@Column(name = "genres")
	private String genres;
	public int getTconst() {
		return tconst;
	}
	public void setTconst(int tconst) {
		this.tconst = tconst;
	}
	public String getTitleType() {
		return titleType;
	}
	public void setTitleType(String titleType) {
		this.titleType = titleType;
	}
	public String getPrimaryTitle() {
		return primaryTitle;
	}
	public void setPrimaryTitle(String primaryTitle) {
		this.primaryTitle = primaryTitle;
	}
	public String getOriginalTitle() {
		return originalTitle;
	}
	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}
	public int getIsAdult() {
		return isAdult;
	}
	public void setIsAdult(int isAdult) {
		this.isAdult = isAdult;
	}
	public int getStartYear() {
		return startYear;
	}
	public void setStartYear(int startYear) {
		this.startYear = startYear;
	}
	public int getEndYear() {
		return endYear;
	}
	public void setEndYear(int endYear) {
		this.endYear = endYear;
	}
	public int getRuntimeMinutes() {
		return runtimeMinutes;
	}
	public void setRuntimeMinutes(int runtimeMinutes) {
		this.runtimeMinutes = runtimeMinutes;
	}
	public String getGenres() {
		return genres;
	}
	public void setGenres(String genres) {
		this.genres = genres;
	}
	@Override
	public String toString() {
		return "Movie [tconst=" + tconst + ", titleType=" + titleType + ", primaryTitle=" + primaryTitle
				+ ", originalTitle=" + originalTitle + ", isAdult=" + isAdult + ", startYear=" + startYear
				+ ", endYear=" + endYear + ", runtimeMinutes=" + runtimeMinutes + ", genres=" + genres + "]";
	}
	
}
