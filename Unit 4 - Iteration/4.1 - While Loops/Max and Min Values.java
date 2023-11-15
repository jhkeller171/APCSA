import java.util.Scanner;

public class MaxMin
{
    public static void main(String[] args)
    {
        int userNum;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number (-1 to quit): ");
        userNum = scanner.nextInt();
        int min = userNum;
        int max = userNum;
        while (userNum != -1){
            if (userNum<min){
                min = userNum;
            } else if(userNum>max){
                max = userNum;
            }
            System.out.println("Smallest # so far: " + min);
            System.out.println("Largest # so far: " + max);
            System.out.println("Enter a number (-1 to quit):");
            userNum = scanner.nextInt();
        }
    }
}
