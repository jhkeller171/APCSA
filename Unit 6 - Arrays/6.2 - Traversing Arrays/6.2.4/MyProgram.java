public class MyProgram
{
    public static void main(String[] args)
    {
        int[] sequence = new int[20];
        sequence[0] = 0;
        sequence[1] = 1;
        
        for (int i=2;i<sequence.length;i++){
            sequence[i] = sequence[i-1] + sequence[i-2];
        }
        
        System.out.println("First 20 Values of the Fibonacci Sequence");
        for (int i=0;i<sequence.length;i++){
            System.out.print(sequence[i]+" ");
        }
        System.out.println(" ");
        System.out.println("First 20 Even Values of the Fibonacci Sequence");
        for (int i=0;i<sequence.length;i+=2){
            System.out.print(sequence[i]+" ");
        }
        System.out.println(" ");
        System.out.println("First 20 Odd Values of the Fibonacci Sequence");
        for (int i=1;i<sequence.length+1;i+=2){
            System.out.print(sequence[i]+" ");
        }
        System.out.println(" ");
        System.out.print("Index Position of 233 is: " + findIndex(sequence, 233));
    }
    public static int findIndex (int[] arr, int n) 
    {
        for (int i=0;i<arr.length;i++){
            if (arr[i] == n){
                return i;
            }
        }
        return -1;
    }
}
