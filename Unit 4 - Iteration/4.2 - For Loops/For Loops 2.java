import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
       Scanner input = new Scanner(System.in);
        System.out.print("In:");
        String word = input.nextLine(); 
        for (int i=0;i<=word.length()-1;i++){
            System.out.println(word.substring(i,i+1));
        }
        for (int i=0;i<=word.length()-1;i+=2){
            System.out.print(word.substring(i,i+1));
        }
         
         
    }
}
