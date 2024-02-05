/*

Given an array, print out the values that are odd.

*/

public class MyProgram
{
    public static void main(String[] args)
    {
        int[ ] values = {525, 111, 416, 914, 124, 811};
        
        // Use an enhanced for loop to iterate through the array
        // Print out all values that are odd on their own line
        for (int value: values){
            if (value%2!=0){
                System.out.print(value + " ");
            }
        }
        
        
    }
}
