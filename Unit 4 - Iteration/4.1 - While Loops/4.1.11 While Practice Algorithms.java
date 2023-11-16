import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        int temp;
        int min;
        int max;
        
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = keyboard.nextInt();
        System.out.println("Enter number 2");
        int num2 = keyboard.nextInt();
        if (num1<num2){
            min = num1;
            max = num2;
        } else {
            min = num2;
            max = num1;
        }
        temp = max;
        while (temp >= min){
            if (temp % 2==0){
                System.out.println(temp);
            } 
            temp--;
        }
     
    }
}
