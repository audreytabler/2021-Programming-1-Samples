import java.util.Scanner;
//Audrey Tabler 700718345
//Inventory manager
//You run a store that has 5 items.
//This program will read in the name of the 5 items, the price for each, and the quantity.

public class HW12_13 {
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("- Welcome to the Inventory Manager -");

		// declare the arrays....
		String[] items = new String[5];
		double[] prices = new double[5];
		int[] quantity = new int[5];

		items = createListOfItems(); // initialize items
		prices = createListOfPrices(items); // intitialize prices
		quantity = getQuantities(items); // initialize quantity
		displayListandCost(items, prices, quantity); // display all items, quantity, and price
		input.nextLine();
		System.out.print("Please enter an item to locate: ");
		String thing = input.nextLine();
		findItem(items, prices, quantity, thing); // prompt user and read string for an item to display
													// calculate and disply total cost of all inventory

		System.out.printf("Total cost of inventory is $%.2f\n", inventoryCost(prices, quantity));

		displayLowInventory(items, quantity); // Display the low inventory

		// Extra credit - prompt user for an item and amount to reduce inventory
		// call reduceInventory and then call displayListandCost
		System.out.println("Enter an item to reduce inventory of: ");
		thing = input.nextLine();
		reduceInventory(items, thing, 4, quantity);
		displayListandCost(items, prices, quantity);

	}// end main

	public static String[] createListOfItems() {
		// returns an array of String populated
		// with 5 items needed from the grocery store
		String[] items = new String[5];
		System.out.println("Please enter five items sold in this store: ");
		for (int i = 0; i < items.length; i++) { // populates array with user input
			items[i] = input.nextLine();
		}
		System.out.println();
		return items;
	}// end createListOfItems

	public static double[] createListOfPrices(String[] list) {
		// displays each item of the list and the prompts and reads
		// the price of the item.
		double[] prices = new double[5];
		String dollars;
		int decimalpoint = 0;
		int sigFigs;
		double finvalues;

		System.out.println("Please enter price of each item sold in this store in USD: ");
		for (int i = 0; i < prices.length; i++) { // populates array with user input
			dollars = input.nextLine();
			if (dollars.charAt(0) == '$') // removes $ if input contains $
				dollars = dollars.substring(1, dollars.length());
			decimalpoint = dollars.indexOf('.');
			sigFigs = dollars.length();

			if (dollars.contains(".")) { // rounds to 2 decimal places if detects more than 2 digits after decimal
				if ((dollars.substring(decimalpoint, dollars.length())).length() >= 3)
					sigFigs = (decimalpoint + 3);
			}
			finvalues = Double.parseDouble(dollars.substring(0, sigFigs)); // converts to double
			prices[i] = finvalues; // dollars.substring(0,sigFigs);

		}
		return prices;

	}// end createListOfPrices

	public static int[] getQuantities(String[] list) {
		// displays each item in list and ask user to enter the current quantity
		// on hand and stores the value in an array of int

		System.out.println("How many of each of these items do we have in stock?");
		int[] quantity = new int[5];
		for (int i = 0; i < list.length; i++) { // populates array with user input
			System.out.print(list[i] + ": ");
			quantity[i] = input.nextInt();
		}
		System.out.println();
		return quantity;

	}// end getQuantities

	public static void displayListandCost(String[] list, double[] price, int[] quantities) {
		// displays the inventory
		System.out.println("Price     Item     Inventory");
		for (int i = 0; i < list.length; i++) { // change this to grid
			// System.out.printf("%s%10.2f%10d\n","$", price[i], list[i], quantities[i]);
			System.out.printf("%.2f%8s%10d\n", price[i], list[i], quantities[i]);
		}

	}// end displayListandCost

	public static void findItem(String[] list, double[] price, int[] quantity, String item) {
		// searches list for item
		// if item is found in the list, will display item quantity, and price
		// if item is not in the list, display an appropriate message to the user
		int done = 0;
		for (int i = 0; i < list.length; i++) {
			if (list[i].equals(item)) {
				done++;
				System.out.println("Item found!");
				System.out.println("$" + price[i] + " " + list[i] + " // " + quantity[i] + " in stock");
			}

		}
		if (done == 0)
			System.out.println("Item not found");

	}// end findItem

	public static double inventoryCost(double[] prices, int[] qty) {
		// sums the quantity * price for each item and returns this value
		double totalCost = 0;
		for (int i = 0; i < prices.length; i++) { // for loop to add together inventory
			totalCost = (totalCost + (prices[i] * qty[i]));
		}
		return totalCost;
	}// end inventoryCost

	public static void displayLowInventory(String[] list, int[] qty) {
		// displays items in list with quantity on hand of less than 3
		System.out.println("Items that are low in stock: ");
		for (int i = 0; i < list.length; i++) {
			if (qty[i] < 3)
				System.out.print(list[i] + "   ");
			// System.out.println("Only " + qty[i] + " of " + list[i] + " left in stock.");
		}
		System.out.println();

	}// end displayLowInventory

	// extra credit
	public static void reduceInventory(String[] list, String item, int amount, int[] qty) {
		// finds item in list and reduces qty by amount
		int done = 0;
		int found = 0;
		int subtract = 0;

		do { // do while loop -- finds the item and loops until user enters correct item
			for (int i = 0; i < list.length; i++) {
				if (list[i].equals(item)) {
					done++;
					found++;
					System.out.println("Enter amount to reduce inventory of " + list[i] + " by: ");
					subtract = input.nextInt();
					qty[i] = (qty[i] - subtract);
				}

			}
			if (done == 0)
				System.out.println("Item not found-- please enter a valid item from our inventory: ");
			item = input.nextLine();
		} while (found == 0);

	}// end reduceInventory

}