/*

Complete the getAverage() method in the ArrayAverage class using an enhanced loop. Create an ArrayAverage object and print the result.

*/

public class MyProgram
{
    public static void main(String[] args)
   {
        double[] numArray =  {93.0, 88.5, 73.5, 97.5, 83.5};
        
        // Create an ArrayAverage object and print the result
        ArrayAverage arr = new ArrayAverage(numArray);
        System.out.print(arr.getAverage());
     
        
   }
}
