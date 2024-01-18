/* Modify this class
  1. Instance variables: String name and int points
  2. Create 2 constructors 
       one takes both attributes
       2nd one takes only the name attribute but you should set points = 0
  3. Create a toString method that will return text - name has ** points
  4. add getter methods for all instance variables
  5. add a setter method for all instance variables
  6. add a mutator method that will add a random number of points between 0 - 7 (inclusive)
  7. add comments to show constructors, getters, setter methods
  */

public class Gamer{
    
    //Private Instance Variables
    private String name;
    private int points;
    
    //Constructors
    public Gamer(String str, int initPoints){
        name = str;
        points = initPoints;
    }
    
    public Gamer(String str){
        name = str;
        points = 0;
    }
    
    
    //ToString method
    public String toString(){
        return name + " has " + points + " points!";
    }
    
    //Getters
    public String getName(){
        return name;
    }
    
    public int getPoints(){
        return points;
    }
    
    //Setters
    public void setName(String str){
        name = str;
    }
    
    public void setPoints(int initPoints){
        points = initPoints;
    }
    
    //Mutator
    public void addPoints(){
        points += (int)((Math.random()*7)+1);
    }
}
