
//Audrey Tabler 700718345
//This program promts user to enter an amount of money in $XX.XX format and will display the result as split into dollars and cents.
import java.util.Scanner;

public class DollarString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value as dollars and cents in this format: $XX.XX: "); // prompt user for input
        String dollars = input.nextLine(); // store input as string
        int decimalpoint = dollars.indexOf('.');
        int stringlength = dollars.length();

        String d = dollars.substring(1, decimalpoint); // split off the first bit after the dollar sign

        String c = dollars.substring(decimalpoint, stringlength); // split off the last bit after the decimal place

        System.out.println("There will be " + d + " dollars and " + c.substring(1, 3) + " cents."); // display result to
                                                                                                    // user
        // System.out.println("stringlength is " + stringlength + " dollars are " + d);

    }

}