import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class MyProgram
{
    public static void main(String[] args)
    {
        String filePath = "cereal.csv";
        Cereal[] cereals = Cereal.readCerealData(filePath);
       
      // add printed labels that explains every item that is outputted!
      
      // use a for loop to print every cereal
      // print out cereal info (call toString())
      System.out.println();
      for (Cereal c: cereals){
          System.out.println(c.toString());
      }
      
      
      // print the names of the cereals with highest rating - ratings > 61.5
      System.out.println();
      System.out.println("Cereals with rating > 61.5");
      for (Cereal c: cereals){
          if (c.getRating() > 61.5){
              System.out.println(c.getName());
          }
      }
      
      
      // print the names of the cereals that have less than 5g of sugar
      System.out.println();
      System.out.println("Cereals with sugar < 5g");
      for (Cereal c: cereals){
          if (c.getSugar() < 5){
              System.out.println(c.getName());
          }
      }
      
      
      // print the names of the cereals that have between 5 - 10g of sugar
      // include 5 and 10
      System.out.println();
      System.out.println("Cereals with sugar >5g and <10g");
      for (Cereal c: cereals){
          if (c.getSugar() >= 5 && c.getSugar() <= 10){
              System.out.println(c.getName());
          }
      }
      
      // print the names of the cereals that have 10g+ of sugar
      // also count how many cereals have more than 10g of sugar 
      // print the number of cereals with more than 10g of sugar
      System.out.println();
      System.out.println("With more than 10g of sugar");
      int sum = 0;
      for (Cereal c: cereals){
          if (c.getSugar() >= 10){
              System.out.println(c.getName());
              sum++;
          }
      }
      System.out.println("There are " + sum + " cereals with more than 10g of sugar");
      
      
      // determine and print the average sugar content from all of the cereals
      sum = 0;
      System.out.println();
      System.out.println("Avg sugar");
      for (Cereal c: cereals){
         sum+=c.getSugar();
      }
      System.out.println("The average amount of sugar is " + (double)(sum)/cereals.length + "grams");
      
      // print the names of cereals with 5 or more proteins
      System.out.println();
      System.out.println("Cereals with >5g of protein");
      for (Cereal c: cereals){
          if (c.getProtein()>=5){
              System.out.println(c.getName());
          }
      }
      
      // print the highest rated cereal's name and rating
      double tempRat = 0;
      String tempName = "";
      System.out.println();
      System.out.println("Highest Rated Cereal");
      for (Cereal c: cereals){
          if (c.getRating()>tempRat){
              tempRat = c.getRating();
              tempName = c.getName();
          }
      }
      System.out.println("Name: "+tempName+" Rating: "+ tempRat);
      
      // print the name of the cereal with the lowest calories
      int tempCal = 1000;
      System.out.println();
      System.out.println("Cereal with the Lowest amount of calories");
      for (Cereal c: cereals){
          if (c.getCalories()<tempCal){
              tempCal = c.getCalories();
              tempName = c.getName();
          }
      }
      System.out.println("Name: "+tempName+" Calories: "+ tempCal);
      
      // Create your own algorithm 
      // add a comment to explain what you found
      // label and print your findings
      
      
      
      
    }
}
