package miniProject2;

import java.util.Scanner;

public class Main {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_YELLOW = "\u001B[33m";

	//TODO Hur löser vi att prodAmount ökar fast metoden hindrar

	public static void main(String[] args) {
		Customer customer1 = new Customer(0, 0);
		Product product1 = new Product("Snickers", 15, 2);
		Product product2 = new Product("Coca-Cola", 20, 2);
		DiscountedProduct product3 = new DiscountedProduct("Skate Board", 2000, 2, 0.3);

		Scanner sc = new Scanner(System.in);
		boolean checkOut = true;
		

		while (checkOut) {

			System.out.println("1. Buy " + product1.getProdName() + ", " + product1.getProdPrice() + " SEK, " + product1.getProdStock() + " left");
			System.out.println("2. Buy " + product2.getProdName() + ", " + product2.getProdPrice() + " SEK, " + product2.getProdStock() + " left");
			System.out.println("3. Buy " + product3.getProdName() + ", " + product3.discountedPrice() + " SEK, " + product3.getProdStock() + " left");
			System.out.println("4. Quit");
			System.out.print("Choose your option: ");

			int input = sc.next().charAt(0);
			switch (input) {
			case '1':
				if (product1.getProdStock() <= 0) {
					System.out.println();
					System.out.println(ANSI_YELLOW + product1.getProdName() + " is out of stock, please buy one of our other products." + ANSI_RESET);
					break;
				}else {
				customer1.setAddToCart(1, product1.getProdPrice());
				product1.setStockSell();
				System.out.println("Your current bag contains " + customer1.getProdAmount() + " items for a total of " + customer1.getsumCost() + " SEK");
				System.out.println();
				break;
				}
			case '2':
				if (product2.getProdStock() <= 0) {
					System.out.println();
					System.out.println(ANSI_YELLOW + product2.getProdName() + " is out of stock, please buy one of our other products." + ANSI_RESET);
					break;
				}else {
				customer1.setAddToCart(1, product2.getProdPrice());
				product2.setStockSell();
				System.out.println("Your current bag contains " + customer1.getProdAmount() + " items for a total of " + customer1.getsumCost() + " SEK");
				System.out.println();
				break;
				}
			case '3':
				if (product3.getProdStock() <= 0) {
					System.out.println();
					System.out.println(ANSI_YELLOW + product3.getProdName() + " is out of stock, please buy one of our other products." + ANSI_RESET);
					break;
				}else {
				customer1.setAddToCart(1, product3.discountedPrice());
				product3.setStockSell();
				System.out.println("Your current bag contains " + customer1.getProdAmount() + " items for a total of " + customer1.getsumCost() + " SEK");
				System.out.println();
				break;
				}
			case '4':
				System.out.println();
				System.out.println("Thanks for your buisness, please come again!");
				System.out.println("You purchased a total of " + customer1.getProdAmount() + " items. The total cost was " + customer1.getsumCost() + " SEK");
				System.out.println();
				checkOut = false;
				break;
			default:
				System.out.println();
				System.out.println(ANSI_RED + "You did a invalid choice, please try again." + ANSI_RESET);
				System.out.println();
				break;
			}
		}
		sc.close();
	}
}
