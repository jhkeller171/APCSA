public class MyProgram
{
    public static void main(String[] args)
    {
        int[] intArray = new int[5];
        intArray[0] = 10;
        intArray[1] = 20;
        intArray[2] = 30;
        intArray[3] = 40;
        intArray[4] = 50;
        
        for (int i=0;i<intArray.length;i++){
            System.out.print(intArray[i] + " ");
        }
        System.out.println(" ");
        for (int i=intArray.length-1;i>=0;i--){
            System.out.print(intArray[i] + " ");
        }
    }
}
