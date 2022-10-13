package miniProject2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Customer customer1 = new Customer(0, 0);
		Product product1 = new Product("Snickers", 15, 2);
		Product product2 = new Product("Coca-Cola", 20, 2);
		DiscountedProduct product3 = new DiscountedProduct("Skate Board", 2000, 2, 0.7);

		Scanner sc = new Scanner(System.in);
		boolean checkOut = true;

		while (checkOut) {

			System.out.println("1. Buy " + product1.prodName + ", " + product1.prodPrice + " SEK, " + product1.prodStock + " left");
			System.out.println("2. Buy " + product2.prodName + ", " + product2.prodPrice + " SEK, " + product2.prodStock + " left");
			System.out.println("3. Buy " + product3.prodName + ", " + product3.discountedPrice() + " SEK, " + product3.prodStock + " left");
			System.out.println("4. Quit");
			System.out.print("Choose your option: ");

			int input = sc.nextInt();
//			System.out.println();
			switch (input) {
			case 1:
				if (product1.getprodStock() <= 0) {
					System.out.println(product1.prodName + " is out of stock, please buy one of our other products.");
					break;
				}else {
				customer1.setAddToCart(1, product1.prodPrice);
				product1.setStockSell();
				System.out.println("Your current bag contains " + customer1.prodAmount + " items for a total of " + customer1.sumCost + " SEK");
				System.out.println();
				break;
				}
			case 2:
				if (product2.getprodStock() <= 0) {
					System.out.println(product2.prodName + " is out of stock, please buy one of our other products.");
					break;
				}else {
				customer1.setAddToCart(1, product2.prodPrice);
				product2.setStockSell();
				System.out.println("Your current bag contains " + customer1.prodAmount + " items for a total of " + customer1.sumCost + " SEK");
				System.out.println();
				break;
				}
			case 3:
				if (product3.getprodStock() <= 0) {
					System.out.println(product3.prodName + " is out of stock, please buy one of our other products.");
					break;
				}else {
				customer1.setAddToCart(1, product3.discountedPrice());
				product3.setStockSell();
				System.out.println("Your current bag contains " + customer1.prodAmount + " items for a total of " + customer1.sumCost + " SEK");
				System.out.println();
				break;
				}
			case 4:
				System.out.println("Thanks for your buisness, please come again!");
				System.out.println("You purchased a total of " + customer1.getProdAmount() + " items. The total cost was " + customer1.getsumCost() + " SEK");
				System.out.println();
				checkOut = false;
				break;
			default:
				System.out.println("You did a invalid choice, please try again.");
				System.out.println();
				break;
			}

		}
		sc.close();

	}

}
