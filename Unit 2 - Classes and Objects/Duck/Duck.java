public class Duck {
    
    private String color;
    private String name;
    private String beakColor;
    private boolean items;
    public boolean test;
    
    public Duck(){
        //default constructor
        color = "yellow";
        beakColor = "orange";
        name = "duckie";
        items = false;
        test = true;
    }
    
    public Duck(String initDuckColor, String initBeakColor){
        color = initDuckColor;
        beakColor = initBeakColor;
        name = "Duckie";
        items = false;
    }
    
    public Duck(boolean initItems, String initColor){
        items = initItems;
        color = initColor;
        name = "Penny";
        beakColor = "Orange";
    }
    
    public void printName(){
        System.out.println(name);
    }
    
}