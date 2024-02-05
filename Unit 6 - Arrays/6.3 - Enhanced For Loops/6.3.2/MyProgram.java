/*

Try using an Enhanced for loop to modify the values of an array, then repeat using a traditional for loop. 



Use the comments in the template to guide you through the exercise.

*/

public class MyProgram
{
    public static void main(String[] args)
    {
        int[] scores = {82, 95, 98, 78, 84};
        
        System.out.println("** Original Values **");
        //Print the values of score using an Enhanced For Loop
        for (int value: scores){
            System.out.print(value + " ");
        }
        
        
        
        //Print blank line in between
        System.out.println();
        
        // Attempt to add 8 in Enhanced For Loop
        for (int value: scores){
            value += 8;
        }
       
       
        
        System.out.println("** Adding in a Enhanced For Loop **");
        //Re-print the values of score using an Enhanced For Loop
        for (int value: scores){
            System.out.print(value + " ");
        }




        //Print blank line in between
        System.out.println();
        
        // Attempt to add 8 in Standard For Loop
        for (int i=0;i<scores.length;i++){
            scores[i] += 8;
        }
  
  
  
      
        System.out.println("** Adding in a Standard For Loop **");
        //Re-print the values of score
       for (int value: scores){
            System.out.print(value + " ");
        }
       
       
       
        System.out.println();
    }
}
