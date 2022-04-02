//Audrey Tabler 700718345
//This code propts users to input a number from 1 - 3 representing rock paper and scissors and then
// generates a random number for the opponents rock paper or scissors and then notifies the user if they have
// won or lost.

import java.util.Scanner;
public class RockpaperscissorsCases {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.print("Please enter either 0 for rock, 1 for paper, or 2 for scissors: "); // prompt user to enter number for rock paper or scissors
        int player = input.nextInt(); // read in value & store in a variable
        int opponent = ((int)(Math.random() * 3)); // generate opponent's value


        // notify the player what they chose
        if (player == 0)
          System.out.println("You chose rock!");
        else if (player == 1)
          System.out.println("You chose paper!");
        else if (player == 2 ) 
          System.out.println("You chose scissors!");
        else{ 
          System.out.println("Invalid input");
          return;
        }
          

        // notify what was chosen for opponent
        if (opponent == 0)
           System.out.println("Opponent chose rock!");
        else if (opponent == 1)
           System.out.println("Opponent chose paper!");
        else System.out.println("Opponent chose scissors!");

        int winloss = (player + opponent); //conbine player & opponent into one variable

        switch(winloss){ // check win loss conditions and notify user of the result
            case 4:
            case 0:
              System.out.println("It is a tie!");
              break;
            case 1:
            case 2:
            case 3:
              if (opponent == player)
                System.out.println("It is a tie!");
              else if ((opponent == 0) && (player== 2))
                System.out.println("You lost!");
              else if ((opponent == 2) && (player ==0))
                System.out.println("You won!");
              else if (opponent > player)
                System.out.println("You lost!");
              else System.out.println("You win!");
              break;

            
            
            

        } 


        
    }
    
}
