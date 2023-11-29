import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("In:");
        String word = input.nextLine();
        //Your code below//
        for (int i=0;i<=word.length()-1;i++){
            if (word.substring(i,i+1).equals("a")||word.substring(i,i+1).equals("e")||word.substring(i,i+1).equals("i")||word.substring(i,i+1).equals("o")||word.substring(i,i+1).equals("u")){
                System.out.println(word.substring(i, i+1));
            }
        }
        
        
        
    }
}
