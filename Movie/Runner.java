/*  Programmer: James Keller
    Date: 9/25/23
    Description: This program takes 4 movies, and prints their title, director, rating, and if they are in theaters
*/


public class MyProgram
{
    public static void main(String[] args)
    {
        Movie movie1 = new Movie("Spaceballs", "Mel Brooks", 7.1);
        Movie movie2 = new Movie("Surfs Up", "Ash Brannon and Chris Buck", 6.7);
        Movie movie3 = new Movie("Surfs Up: Wrestlemania");
        Movie movie4 = new Movie("Flushed Away");
        
        System.out.println("Movie 2 Rating: " + movie2.getRating());
        movie2.setRating(4.5);
        System.out.println("Movie 1 Director: " + movie1.getDirector());
        movie3.setInTheaters(true);
        System.out.println("");
        
        System.out.println("Movie 1 Info:");
        movie1.printMovieInfo();
        System.out.println("");
        System.out.println("Movie 2 Info:");
        movie2.printMovieInfo();
        System.out.println("");
        System.out.println("Movie 3 Info:");
        movie3.printMovieInfo();
        System.out.println("");
        System.out.println("Movie 4 Info:");
        movie4.printMovieInfo();
        
        
    }
}