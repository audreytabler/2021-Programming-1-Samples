public class Wargame{
    public static void main(String[] args){

        final int NUMBER_OF_CARDS = 52;
        // Pick a card (0-51)
        int number1 = (int)(Math.random() * NUMBER_OF_CARDS);
        System.out.println(number1 + ":");


        if (number1 % 12 == 0)
            System.out.print("Ace of ");
        else if (number1 % 13 == 10)
            System.out.print("Jack of ");
        else if (number1 % 13 == 10)
            System.out.print("Queen of ");
        else if (number1 % 13 == 10)
            System.out.print("King of ");
        else
            System.out.print(((number1 % 13)+ 1) + " of ");
        

        //determine face of card and display

        //determine the suit and display

        if (number1 / 13 == 0)
            System.out.println("Clubs");
        else if (number1 / 13 == 1)
            System.out.println("Diamonds");
        else if (number1 / 13 == 2)
            System.out.println("Hearts");
        else if (number1 / 13 == 3)
            System.out.println("Spades");


        // Pick a second card (0-51)
        int number2 = (int)(Math.random() * NUMBER_OF_CARDS);
        System.out.println(number2 + ":");

        if (number2 % 12 == 0)
            System.out.print("Ace of ");
        else if (number2 % 13 == 10)
            System.out.print("Jack of ");
        else if (number2 % 13 == 10)
            System.out.print("Queen of ");
        else if (number2 % 13 == 10)
            System.out.print("King of ");
        else
            System.out.print(((number2 % 13)+ 1) + " of ");
        

        //determine face of card and display

        //determine the suit and display

        if (number2 / 13 == 0)
            System.out.println("Clubs");
        else if (number2 / 13 == 1)
            System.out.println("Diamonds");
        else if (number2 / 13 == 2)
            System.out.println("Hearts");
        else if (number2 / 13 == 3)
            System.out.println("Spades");
        
        if ((number1 % 13) > (number2 % 13))
           System.out.println("Player1 wins!");
        else if ((number1 % 13) < (number2 % 13))
           System.out.println("Player2 wins!");
        else System.out.println("It's a tie!");

        

        
        

    }
}