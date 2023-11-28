/* Programmer: James Keller
   Date: 11/27/23
   Description: Stuck in the mud game
*/

import java.util.Scanner;

public class Runner
{
    public static void main(String[] args)
    {
        //PRINTS
        Scanner scanner = new Scanner(System.in);
        System.out.println("Let's Play 'Stuck in the Mud'!");
        System.out.println("Rolling dice...");
        
        int temp1=1,temp2=1,temp3=1,temp4=1,temp5=1;
        int computerScore = 0;
        int playerScore = 0;
        String computer = "[";
        int comp = 0;
        String player = "[";
        int play = 0;
        dice die = new dice();
        boolean playAgain = true;
        String userInput = "";
        
        //PLAYER ROLLING
        
        while (playAgain = true){ 
            
            
        while (temp1 != 0){
            temp1 = die.roll();
            play = play + temp1;
            if (temp1 != 0){
                player += temp1 + " ";
            } else {
                temp1 = 1;
                break;
            }
        }
        while (temp2 != 0){
            temp2 = die.roll();
            play = play + temp2;
            if (temp2 != 0){
                player += temp2 + " ";
            } else {
                temp2 = 1;
                break;
            }
        }
        while (temp3 != 0){
            temp3 = die.roll();
            play = play + temp3;
            if (temp3 != 0){
                player += temp3 + " ";
            } else {
                temp3 = 1;
                break;
            }
        }
        while (temp4 != 0){
            temp4 = die.roll();
            play = play + temp4;
            if (temp4 != 0){
                player += temp4 + " ";
            } else {
                temp4 = 1;
                break;
            }
        }
        while (temp5 != 0){
            temp5 = die.roll();
            play = play + temp5;
            if (temp5 != 0){
                player += temp5 + " ";
            } else {
                player += "]";
                temp5 = 1;
                break;
            }
        }
        System.out.println("You rolled: " + player);
        System.out.println("Total Player: " + play);
        
        //COMPUTER ROLLING
        
        while (temp1 != 0){
            temp1 = die.roll();
            comp += temp1;
            if (temp1 != 0){
                computer += temp1 + " ";
            } else {
                break;
            }
        }
        while (temp2 != 0){
            temp2 = die.roll();
            comp += temp2;
            if (temp2 != 0){
                computer += temp2 + " ";
            } else {
                break;
            }
        }
        while (temp3 != 0){
            temp3 = die.roll();
            comp += temp3;
            if (temp3 != 0){
                computer += temp3 + " ";
            } else {
                break;
            }
        }
        while (temp4 != 0){
            temp4 = die.roll();
            comp += temp4;
            if (temp4 != 0){
                computer += temp4 + " ";
            } else {
                break;
            }
        }
        while (temp5 != 0){
            temp5 = die.roll();
            comp += temp5;
            if (temp5 != 0){
                computer += temp5 + " ";
            } else {
                computer += "]";
                break;
            }
        }
        
        playAgain = true;
        System.out.println("Computer Rolled: " + computer);
        System.out.println("Total Computer: " + comp);
        System.out.println("");
        if (comp > play){
            computerScore++;
            System.out.println("Computer Wins! \n");
        } else {
            playerScore++;
            System.out.println("Player Wins! \n");
        }
        System.out.println("Do you want to play again?");
        userInput = scanner.nextLine();
        System.out.println("");
        if ((userInput.equals("no")||userInput.equals("No")||userInput.equals("NO"))){
            //Add final score
            System.out.println("Computer Wins: " + computerScore);
            System.out.println("Player Wins: "+ playerScore + "\n");
            if (playerScore > computerScore){
                System.out.println("Player Wins!");
            } else {
                System.out.println("Computer Wins!");
            }
            break;
        } else {
            playAgain = true;
        }
        //Reset Variables
        comp = 0;
        play = 0;
        computer = "[";
        player = "[";
        temp1=1;
        temp2=1;
        temp3=1;
        temp4=1;
        temp5=1;
        
        
        }
    }
}
