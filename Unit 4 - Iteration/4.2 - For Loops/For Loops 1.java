import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("In:");
        int end = input.nextInt();
        for (int i=0;i<2*end;i++){
            System.out.print(i+" ");
        }
    

    }
}
