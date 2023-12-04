public class Movie {
    
    //Private Instance Variables
    private String title;
    private String director;
    private double rating;
    private boolean inTheaters;
    
    //Constructors
    public Movie(String initTitle, String initDirector, double initRating){
        title = initTitle;
        director = initDirector;
        rating = initRating;
    }
    
    public Movie(String initTitle){
        title = initTitle;
        director = "unknown";
        rating = 0.0;
        inTheaters = false;
    }
    
    //Methods
    public void printMovieInfo(){
        System.out.println("Title: " + title);
        System.out.println("Director: " + director);
        System.out.println("Rating: " + rating);
        System.out.println("In Theaters: " + inTheaters);
    }
    
    //Getters
    public String getTitle(){
        return title;
    }
    
    public String getDirector(){
        return director;
    }
    
    public double getRating(){
        return rating;
    }
    
    public boolean getInTheaters(){
        return inTheaters;
    }
    
    //Setters
    
    public void setInTheaters(boolean initInTheaters){
        inTheaters = initInTheaters;
    }
    
    public void setRating(double initRating){
        rating = initRating;
    }
}