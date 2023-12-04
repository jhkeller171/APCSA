import java.util.Scanner;
public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        /*  (1)
        Name: James Keller
        Date: 11/7/23
        Decription: This program is APCSA Unit 3 Practice
        */
        
        
        //PART 1
        System.out.println("Part 1:");
        int rand1 = (int)((Math.random()*12)+1);
        int rand2 = (int)((Math.random()*12)+1);
        System.out.println("What is the product of " +rand1 + " * "+ rand2+"?");
        int userProd = keyboard.nextInt();
        if (userProd == rand1*rand2){
            System.out.println("Correct!");
        } else {
            System.out.println("Incorrect!");
            System.out.println(rand1+" * "+rand2 + " = "+rand1*rand2);
        }
        
        //PART 2
        System.out.println("Part 2:");
        System.out.println("What is the value of the first octet?");
        int octet1 = keyboard.nextInt();
        System.out.println("What is the value of the second octet?");
        int octet2 = keyboard.nextInt();
        System.out.println("What is the value of the third octet?");
        int octet3 = keyboard.nextInt();
        System.out.println("What is the value of the fourth octet?");
        int octet4 = keyboard.nextInt();
        
        if (octet1<=255&&octet2<=255&&octet3<=255&&octet4<=255&&octet1>=0&&octet2>=0&&octet3>=0&&octet4>=0){
            System.out.println("IP Address: " + octet1+"."+octet2+"."+octet3+"."+octet4);
        } 
        if (octet1<0||octet1>255){
            System.out.println("Octet 1 is incorrect");
        }
        if (octet2<0||octet2>255){
            System.out.println("Octet 2 is incorrect");
        }
        if (octet3<0||octet3>255){
            System.out.println("Octet 3 is incorrect");
        }
        if (octet4<0||octet4>255){
            System.out.println("Octet 4 is incorrect");
        }
        //PART 3
        System.out.println("Part 3:");
        System.out.println("Enter X-Coordinate");
        double x = keyboard.nextDouble();
        System.out.println("Enter Y-Coordinate");
        double y = keyboard.nextDouble();
        if (Math.sqrt((Math.pow((x-0),2)+Math.pow(y-0,2))) < 10){
             System.out.println("Point "+ "("+x+","+y+") is within the circle");
        } else if (Math.sqrt((Math.pow((x-0),2)+Math.pow(y-0,2))) >= 9.9 && Math.sqrt((Math.pow((x-0),2)+Math.pow(y-0,2))) <= 10.1){
            System.out.println("Point "+ "("+x+","+y+") is on the circumfrence of the circle");
        } else {
            System.out.println("Point "+ "("+x+","+y+") is not within the circle");
        }
        //PART 4
        System.out.println("Part 4:");
        int lotto = (int)((Math.random()*90)+10);
        System.out.println("Can you guess the lottery number? Enter a 2 digit number:");
        int userLotto = keyboard.nextInt();
        if (lotto == userLotto){
            System.out.println("Congratulations! You guessed the lottery number which was "+lotto+"! You win $10,000!");
        } else if (userLotto >= lotto-4 && userLotto <= lotto+4){
            System.out.println("You are within 4 numbers of the lottery number, which was "+lotto+"! You win $3,000!");
        } else if (userLotto >= lotto-8 && userLotto <= lotto+8){
            System.out.println("You are within 8 numbers of the lottery number, which was "+lotto+"! You win $1,000!");
        } else {
            System.out.println("You did not win the lottery, the winning number was "+lotto);
        }
    }
}
