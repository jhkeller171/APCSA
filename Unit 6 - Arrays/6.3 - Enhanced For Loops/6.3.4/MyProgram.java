/*

Find and print the longest word in the array provided. If there are more than one word with the longest length, find and print the last word of that length.

HIINT: You need to store both the length and the name of the snack item.

*/

public class MyProgram
{
    public static void main(String[] args)
    {
        String [] words = {"chips", "dip", "pizza", "wings","cookies","doughnut", "pretzels"};
        
        // remember to store the length and value of the item with the longest name
        // if more than one item has that length, store the last value
        String longest = "";
        int length = -1;
        for (String value: words){
            if (value.length()>=length){
                longest = value;
                length = value.length();
            }
        }
        System.out.println("The longest word in array is " + longest + ", it contains " + longest.length() + " letters");
        
    }
}
