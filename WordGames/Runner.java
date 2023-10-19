import java.util.Scanner;
/* Programmer: James Keller
    Date: 10/4/23
    Description: Modifies strings provided by the user
*/
public class Runner
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please Type a Word:");
        String userWord = input.nextLine();
        System.out.println();
        
        //create a WordGame Object using user's word as parameter
        WordGames word1 = new WordGames(userWord);
        //print the WordGame Object 
        System.out.println("Original word is: " + word1.toString());
        System.out.println();
        //whisper it and print
        System.out.println("Whisper: " + word1.whisper());
        System.out.println();
        //yell it and print
        System.out.println("Yell: " + word1.yell());
        System.out.println();
        // Scramble it and print
        System.out.println("Scrambled Word: " + word1.scramble());
        System.out.println();
        // Ask for an index (integer)
        System.out.println("Enter an Integer (Index): ");
        int userIndex = Integer.valueOf(input.nextLine());
        System.out.println();
         //this is used to skip over the new line  - this is a Java input issue (EX: input.nextLine();)

        // Ask for random word which will be inserted into the original word
        System.out.println("Enter a random word: ");
        String userNewWord = input.nextLine();
        System.out.println();
        //bananaSplit the original word with the new word at specified index and print
        System.out.println("Word Split 1: " + word1.bananaSplit(userIndex, userNewWord));
        
        //print a blank line
        System.out.println();
        //prompt for another word
         System.out.println("Please Type a New Word");
        //set WordGame variable to the new word
        userWord = input.nextLine();
        WordGames newWord = new WordGames(userWord);
        System.out.println();
        //print the updated WordGame object
        System.out.println("The New Word is: " + newWord.toString());
        System.out.println();
        // Ask for a single letter from the new word (store as a String)
        System.out.println("Enter a Single Letter from the New Word");
        String newChar = input.nextLine();
        System.out.println();
        //Ask for another word which will be inserted into the new word
        System.out.println("Enter a new Word to be Inserted into the new word");
        String insertWord = input.nextLine();
        System.out.println();
         //bananaSplit the new word with the last word at specified letter and print
       System.out.println("Word Split 2: "+ newWord.bananaSplit(newChar, insertWord));
        
        
    }
}
