package com.aurionpro.model;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MovieManager {

	List<Movie> movies;
	static final String filepath = "D:\\Aurionpro Java 21\\53-Movie-Example\\data.bin";

	public MovieManager() {

		movies = new ArrayList<Movie>();
		// movies.add(new Movie(1, "ABCD", 2001, "Drama"));
		loadMovies();
	}

	private void loadMovies() {
		try {
			FileInputStream file = new FileInputStream(filepath);
			ObjectInputStream input = new ObjectInputStream(file);
			movies = (List<Movie>) input.readObject();
			input.close();
			file.close();
			System.out.println("After Deserialization");

		} catch (IOException error) {
			System.out.println("IOException is caught");
		} catch (ClassNotFoundException erro) {
			System.out.println("ClassNotFoundException is caught");
		}

	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void addMovie(Movie movie) {
		movies.add(movie);
		System.out.println(movies);
		saveMovies();
		System.out.println("Movie Added Successfully");
	}

	public void clearMovies() {
		movies = null;
		saveMovies();
	}

	public Map<Integer, String> getMoviesById() {
		Map<Integer, String> temp = new HashMap<Integer, String>();
		for (int index = 0; index < movies.size(); index++) {
			temp.put(movies.get(index).getMovieId(), movies.get(index).getMovieName());
		}
		return temp;
	}

	public void deleteMovieById(int id) {
		boolean foundId = false;
		Movie temp = null;
		for (Movie x : movies) {
			if (x.getMovieId() == id) {
				foundId = true;
				temp = x;
			}
		}
		if (foundId) {
			movies.remove(temp);
			System.out.println("Movie Deleted");
		} else {
			System.out.println("Movie Id Not Found");
		}
	}

	private void saveMovies() {
		try {
			FileOutputStream file = new FileOutputStream(filepath);
			ObjectOutputStream out = new ObjectOutputStream(file);
			out.writeObject(movies);
			out.flush();
			out.close();
			file.close();
			System.out.println("Object Has been Serialized");
			loadMovies();
		} catch (IOException error) {
			System.out.println("IOException is caught");
		}
	}

}
