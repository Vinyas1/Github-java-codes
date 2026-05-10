package jav1;
import java.util.ArrayList;
import java.util.Scanner;

class Movie {
    private String title;
    private String director;
    private int year;

    public Movie(String title, String director, int year) {
        this.title = title;
        this.director = director;
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public String toString() {
        return "Title: " + title + ", Director: " + director + ", Year: " + year;
    }
}

public class MovieProgram {
    private ArrayList<Movie> movies;
    private Scanner scanner;

    public MovieProgram() {
        movies = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void addMovie() {
        System.out.print("Enter movie title: ");
        String title = scanner.nextLine();
        System.out.print("Enter director: ");
        String director = scanner.nextLine();
        System.out.print("Enter release year: ");
        int year = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        movies.add(new Movie(title, director, year));
        System.out.println("Movie added!");
    }

    public void listMovies() {
        if (movies.isEmpty()) {
            System.out.println("No movies in the collection.");
        } else {
            System.out.println("Movies in the collection:");
            for (Movie movie : movies) {
                System.out.println(movie);
            }
        }
    }

    public void searchMovie() {
        System.out.print("Enter movie title to search: ");
        String title = scanner.nextLine();
        boolean found = false;
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                System.out.println("Found: " + movie);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Movie not found.");
        }
    }

    public void run() {
        int choice;
        do {
            System.out.println("\n1. Add Movie");
            System.out.println("2. List Movies");
            System.out.println("3. Search Movie");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addMovie();
                    break;
                case 2:
                    listMovies();
                    break;
                case 3:
                    searchMovie();
                    break;
                case 4:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (choice != 4);
    }

    public static void main(String[] args) {
        MovieProgram program = new MovieProgram();
        program.run();
    }
}
