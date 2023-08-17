package com.aurionpro.model;

import com.aurionpro.model.*;

import java.util.*;

public class MovieController {

	private MovieManager manager;

	public MovieController() {
		manager = new MovieManager();
	}

	public void start() {
		displayMenu();
	}

	private void displayMenu() {
		int choice = 0;
		while (choice != 5) {

			Scanner sc = new Scanner(System.in);
			System.out.println("Movie Store Menu");
			System.out.println("1. List of Movies");
			System.out.println("2. Add Movie");
			System.out.println("3. Delete Movie by Id");
			System.out.println("4. Delete All Movies");
			System.out.println("5. Exit");
			System.out.println("Enter Your Choice");

			choice = sc.nextInt();

			switch (choice) {
			case 1:
				List<Movie> movies = manager.getMovies();
				if (movies.isEmpty()) {
					System.out.println("No Movies present in List");
				} else {
					System.out.println(movies);
				}
				break;
			case 2:
				Movie movie = setMovie();
				manager.addMovie(movie);
				break;
			case 3:
				System.out.println("Enter movie Id");
				int id = sc.nextInt();
				manager.deleteMovieById(id);
				break;
			case 4:
				manager.clearMovies();
				break;
			case 5:
				System.out.println("Thank you for using movies app");
				break;
			default:
				System.out.println("Invalid Choice");

			}
		}

	}

	private Movie setMovie() {

		Movie temp = new Movie();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Movie ID:");
		temp.setMovieId(scanner.nextInt());

		System.out.print("Enter movie name: ");
		temp.setMovieName(scanner.next());

		System.out.print("Enter movie year: ");
		temp.setMovieYear(scanner.nextInt());

		System.out.print("Enter movie genre: ");
		temp.setMovieGenre(scanner.next());
		;

		return temp;
	}

}
