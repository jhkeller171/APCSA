import java.util.Scanner;
/* Programmer:
   Date:
   Description:
*/
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in your text: ");
        String text = input.nextLine();
        text= text.replaceAll("\\s", "");  //removes spaces from phrase
        text=text.toLowerCase();
        //remember to convert text to lowercase

        // Your code goes below!
        if (isPalindrome(text) == true){
            System.out.println("Your word is a palindrome!");
        } else {
            System.out.println("Not a palindrome :(");
        }
        
        
    }
    
    // returns boolean based on if text is palindrome
    public static boolean isPalindrome(String text)
    {
        String reverso = reverse(text);
        if (reverso.equals(text)){
            return true;
        } else {
            return false;
        }
    }
    
    
     //This method reverses a String.
     //You do NOT have to use this method
    public static String reverse(String text)
    {
        // Your code goes here!
        String reverseInProgress ="";
        for (int i=text.length()-1;i>=0;i--){
            reverseInProgress += text.substring(i,i+1);
        }
        return reverseInProgress;
    }

}
