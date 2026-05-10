
package jav1;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MovieDatabaseApp {

    // Movie class to represent each movie or series
   public static class Movie {
        private String title;
        private String description;
        private String releaseDate;
        private String ageRating;
        private int seasons;
        private int episodes;

        public Movie(String title, String description, String releaseDate, String ageRating, int seasons, int episodes) {
            this.title = title;
            this.description = description;
            this.releaseDate = releaseDate;
            this.ageRating = ageRating;
            this.seasons = seasons;
            this.episodes = episodes;
        }

        public String getTitle() {
            return title;
        }

        public String getDescription() {
            return description;
        }

        public String getReleaseDate() {
            return releaseDate;
        }

        public String getAgeRating() {
            return ageRating;
        }

        public int getSeasons() {
            return seasons;
        }

        public int getEpisodes() {
            return episodes;
        }
    }

    // MovieDatabase class to manage the collection of movies and series
    public static class MovieDatabase {
        private List<Movie> movies;

        public MovieDatabase() {
            movies = new ArrayList<>();
            // Adding sample movies and series
            movies.add(new Movie("Inception", 
                "A thief who steals corporate secrets through dream-sharing technology.", 
                "2010-07-16", 
                "PG-13", 
                0, // No seasons for movies
                0)); // No episodes for movies

            movies.add(new Movie("The Godfather", 
                "The aging patriarch of an organized crime dynasty transfers control to his reluctant son.", 
                "1972-03-24", 
                "R", 
                0, // No seasons for movies
                0)); // No episodes for movies

            movies.add(new Movie("The Dark Knight", 
                "When the Joker emerges from his mysterious past, he wreaks havoc on Gotham.", 
                "2008-07-18", 
                "PG-13", 
                0, // No seasons for movies
                0)); // No episodes for movies

            movies.add(new Movie("Stranger Things", 
                "A group of kids uncover supernatural forces and secret government experiments.", 
                "2016-07-15", 
                "TV-14", 
                4, // Number of seasons
                34)); // Total episodes
        }

        public Movie findMovie(String title) {
            for (Movie movie : movies) {
                if (movie.getTitle().equalsIgnoreCase(title)) {
                    return movie;
                }
            }
            return null; // Movie not found
        }
    }

    // Main application class to interact with the user
    public static void main(String[] args) {
        MovieDatabase movieDatabase = new MovieDatabase();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Movie Database!");
        System.out.print("Enter the movie or series title to search: ");
        String movieTitle = scanner.nextLine();

        Movie foundMovie = movieDatabase.findMovie(movieTitle);

        if (foundMovie != null) {
            System.out.println("Title: " + foundMovie.getTitle());
            System.out.println("Description: " + foundMovie.getDescription());
            System.out.println("Release Date: " + foundMovie.getReleaseDate());
            System.out.println("Age Rating: " + foundMovie.getAgeRating());
            System.out.println("Seasons: " + foundMovie.getSeasons());
            System.out.println("Episodes: " + foundMovie.getEpisodes());
        } else {
            System.out.println("Error: Movie or series not found in the database.");
        }

        scanner.close();
    }
}
