public class ArrayAverage {
    private double[] values;

    public ArrayAverage(double[] theValues)
    {
      values = theValues;
    }
    
    public double getAverage()
    {
     // your code goes here!
     double sum = 0;
     for (double value: values){
         sum += value;
     }
     return (sum/values.length);
    

    }

}
