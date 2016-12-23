/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
the name of the movie, 
the movie rating, such as G for general audience, PG for parental guidance, PG-13, etc, 
the year the movie was made, and 
the run time in minutes. 
 */
package movielistchallenge;

/**
 *
 * @author kimberlylin
 */
public class Movie {
    private String movieTitle;
    private String movieRating;
    private int movieYear;
    private int movieRunTime;
    public Movie(String movieTitle, String movieRating, int movieYear, int movieRunTime)
    {
        this.movieTitle = movieTitle;
        this.movieRating = movieRating;
        this.movieYear = movieYear;
        this.movieRunTime = movieRunTime;
    }
    public String toString()
    {
        return "Movie Title: " + movieTitle +
                "\nMovie Rating: " + movieRating +
                "\nMovie was created in: " + movieYear +
                "\nMovie's run time in minute is: " + movieRunTime;
    }
    public String getMovieTitle() 
    {
        return movieTitle;
    }
    public void setMovieTitle(String title)
    {
        movieTitle = title;
    }
    public String getMovieRating()
    {
        return movieRating;
    } 
    public void setMovieRating(String rating)
    {
        movieRating = rating;
    }
    public int getMovieYear()
    {
        return movieYear;
    }
    public void setMovieYear(int year)
    {
        movieYear = year;
    }
    public int getMovieRunTime()
    {
        return movieRunTime;
    }
    public void setMovieRunTime(int runtime)
    {
        movieRunTime = runtime;
    }
}
