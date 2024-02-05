/*

In this exercise, use the Fruit class to print out each fruit using an enhanced for loop with the fruit's name, grams of sugar per serving, and grams of carbs per serving.



You will need to finish the class with the appropriate getter (accessor) methods for fruit name, sugar, and carbs.



Use the escape sequence to tab the values apart.

*/

public class MyProgram
{
     public static void main(String[] args){
         
        Fruit lemon = new Fruit("Lemon", 1.4, 5);
        Fruit apple = new Fruit("Apple", 19, 25);
        Fruit watermelon = new Fruit("Orange", 9, 11);
        Fruit banana = new Fruit("Banana", 17, 31);
        Fruit strawberry = new Fruit("Peach", 13, 14);
        
        // create an array of Fruit items
        Fruit[] arr = {lemon, apple, watermelon, banana, strawberry};

        
        // use an enhanced for loop to access each Fruit item
        // create a table using an escape sequencewith Fruit's 
        // name, sugar, and carbs
        System.out.println("Fruit   Sugar   Carbs");
        for (Fruit item: arr){
            System.out.println(item.getName()+"  "+item.getSugar()+"    "+item.getCarbs());
        }
      
         
         
         
     }
}
