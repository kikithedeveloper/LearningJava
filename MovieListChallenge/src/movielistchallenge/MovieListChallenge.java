/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movielistchallenge;
import java.util.Scanner;
/**
 *
 * @author kimberlylin
 */
public class MovieListChallenge {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // instantiate a blank Movie object
        // use accessor and mutator methods to get or set
        
//        Movie favoriteMovie = new Movie();
//        String response = "";
//        Scanner in = new Scanner(System.in);
//        
//        do {
//            System.out.println("I want to know your favorite movie.");
//            System.out.println("Enter the title of the movie: ");
//            favoriteMovie.setMovieTitle(in.nextLine());
//            System.out.println("Enter the rating of the movie: G, PG, PG-13, R");
//            favoriteMovie.setMovieRating(in.nextLine());
//            System.out.println("Enter the year of the movie: ");
//            favoriteMovie.setMovieYear(in.nextInt());
//            System.out.println("Enter the runtime of the movie in minutes: ");
//            favoriteMovie.setMovieRunTime(in.nextInt());
//            System.out.println("You can change the movie title if you wish.");
//            favoriteMovie.setMovieTitle(in.nextLine());
//            System.out.println(favoriteMovie.getMovieTitle());
//
//            System.out.println("Do you have another patient? y or n");
//            response = in.next();
//        } while (response.equalsIgnoreCase("y"));

        String title = "";
        String rating = "";
        int year = 0;
        int runtime = 0;
        Scanner in = new Scanner(System.in);
        System.out.println("I want to know your favorite movie.");
        System.out.println("Enter the title of the movie: ");
        title = in.nextLine();
        System.out.println("Enter the rating of the movie: G, PG, PG-13, R");
        rating = in.nextLine();
        System.out.println("Enter the year of the movie: ");
        year = in.nextInt();
        System.out.println("Enter the runtime of the movie in minutes: ");
        runtime = in.nextInt();
        Movie favoriteMovie = new Movie(title, rating, year, runtime);
        System.out.println(favoriteMovie.toString());
    }
    
}
