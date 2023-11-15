import java.util.Scanner;
public class GuessTheNumber
{ 
    // This is the secret number that will pass the autograder!
    static int secretNumber = 6;
    public static void main(String[] args)
    {
        // Allow the user to keep guessing numbers between
        // 1 and 10 until they guess the correct number
        
        System.out.println("I'm thinking of a number between 1 and 10.");
        System.out.println("See if you can guess the number!");
        
        // This calls the static method GuessMyNumber. Notice that the method is outside 
        // of the main method. 
        guessMyNumber();
        
    }
    
    public static void guessMyNumber() 
    {  
        Scanner scanner = new Scanner(System.in);
        boolean guessed = false;
        while (guessed == false){
            System.out.println("Enter your guess:");
            int userNum = scanner.nextInt();
            if (userNum == secretNumber){
                guessed = true;
                System.out.println("Correct!");
            } else {
                System.out.println("Try again!");
            }
        }
    }
}
