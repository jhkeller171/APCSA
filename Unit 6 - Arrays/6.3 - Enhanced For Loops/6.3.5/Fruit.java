public class Fruit {
    private String name;
    private double sugar;
    private int carbs;
    
    public Fruit(String initName, double initSugar, int initCarbs){
        name = initName;
        sugar = initSugar;
        carbs = initCarbs;
    } 
    
    //add getters to return the values of all instance variables
    
    public String getName(){
        return name;
    }
    
    public double getSugar(){
        return sugar;
    }
    
    public int getCarbs(){
        return carbs;
    }



}
