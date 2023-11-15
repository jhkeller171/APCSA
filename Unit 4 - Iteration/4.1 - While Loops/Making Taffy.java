import java.util.Scanner;
public class TaffyTester
{
    public static void main(String[] args)
    {
       Scanner scanner = new Scanner(System.in);
       int temp;
       System.out.println("Starting Taffy Timer");
       System.out.print("Enter temperature:");
       temp = scanner.nextInt();
       while (temp < 270){
           System.out.println(" The mixture isn't ready yet");
           System.out.print("Enter temperature:");
           temp = scanner.nextInt();
       }if (temp>=270){
           System.out.println("Your taffy is ready for the next step!");
       }
    }
}
