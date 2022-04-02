//Audrey Tabler Sprint 5
//This program reads two integers from the user that represent
//two sets of adjacent sides of a four sided shape.
//Think  two sides of a square or  a rectangle....
//The program will display the area of the shape.
//The program will display whether the shape is
//a square or rectangle.



import java.util.Scanner;

public class CodeSprint5{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);

		//Prompt and read the width
		System.out.print("Please enter width: ");
		int width = input.nextInt();

		//Prompt and read the height
		System.out.print("Please enter height: ");
		int height = input.nextInt();

		//Call method to calculate the area
		//and display the result from the method call.
        System.out.println("Area of this shape is " + calculateArea(height, width));



		//invoke the method to display whether this is
		//a square of a rectangle.
        squareOrRectangle(height, width);



	}//end main

	//method calculateArea will receive a value
	//for height and width of a 4-sided shape and return
	//the area which is height times width

	public static int calculateArea(int h, int w){
        return(h*w);
    }


	//method squareOrRectangle will receive a value for height
	//and width and will compare the height and width to display
	//whether the two sides make a square or a rectangle.
	//A square has all sides the same length.
	//Rectangles have sides that are not the same length.
	//This method does not return a value, just displays
	// "square" or "rectangle"
	public static void squareOrRectangle(int h, int w){
        if (h == w)
          System.out.println("square");
        else 
          System.out.println("rectangle");
    }
	

}//end class CodeSprint5