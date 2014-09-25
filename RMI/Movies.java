package com.moviestheater;

import java.io.Serializable;

public class Movies implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4615999519641675367L;
	private String movieName;
	private String movieLanguage;
	private String movieTimings;
	/**
	 * @return the movieName
	 */
	public String getMovieName() {
		return movieName;
	}
	/**
	 * @param movieName the movieName to set
	 */
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	/**
	 * @return the movieLanguage
	 */
	public String getMovieLanguage() {
		return movieLanguage;
	}
	/**
	 * @param movieLanguage the movieLanguage to set
	 */
	public void setMovieLanguage(String movieLanguage) {
		this.movieLanguage = movieLanguage;
	}
	/**
	 * @return the movieTimings
	 */
	public String getMovieTimings() {
		return movieTimings;
	}
	/**
	 * @param movieTimings the movieTimings to set
	 */
	public void setMovieTimings(String movieTimings) {
		this.movieTimings = movieTimings;
	}
	
	
	
}
