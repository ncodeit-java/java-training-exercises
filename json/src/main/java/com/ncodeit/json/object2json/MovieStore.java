package com.ncodeit.json.object2json;

import java.util.List;

public class MovieStore {
	
	private int movieStoreId;
	private String movieStoreName;
	
	private List<String> movies;

	public int getMovieStoreId() {
		return movieStoreId;
	}

	public void setMovieStoreId(int movieStoreId) {
		this.movieStoreId = movieStoreId;
	}

	public String getMovieStoreName() {
		return movieStoreName;
	}

	public void setMovieStoreName(String movieStoreName) {
		this.movieStoreName = movieStoreName;
	}

	public List<String> getMovies() {
		return movies;
	}

	public void setMovies(List<String> movies) {
		this.movies = movies;
	}
	
}
