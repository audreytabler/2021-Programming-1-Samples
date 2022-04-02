//Audrey Tabler 700718345
//This program prompts the user to enter a lowercase or uppercase letter and 
//display its corresponding number on a phone's keypad. For a non-letter input, it will display “invalid input”

import java.util.Scanner;

public class Phonekeypad2{
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    //Prompt user to input the letter
    System.out.print("Please enter a letter [A - Z] you wish to be displayed as the corresponding number on a telephone keypad: ");

    String s = input.nextLine(); //store input here
    String upper = s.toUpperCase(); //convert input to uppercase
    char letter = upper.charAt(0); //make into value that can be used by a switch

    // go through the cases for each letter and print the final result
    switch (letter){
        case 0:
          System.out.print("0");
        case 1: 
          System.out.print("1");
        case 'A':
        case 'B':
        case 'C': 
          System.out.print("2");
          break;
        case 'D':
        case 'E':
        case 'F':
          System.out.print("3");
          break;
        case 'G':
        case 'H':
        case 'I':
          System.out.print("4");
          break;
        case 'J':
        case 'K':
        case 'L':
          System.out.print("5");
          break;
        case 'M':
        case 'N':
        case 'O':
          System.out.print("6");
          break;
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
          System.out.print("7");
          break;
        case 'T':
        case 'U':
        case 'V':
          System.out.print("8");
          break;
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
          System.out.print("9");
          break;
        default: System.out.print("Invalid input");
    }

   


    






  }
}

