package exercises;

import java.util.Scanner;

public class exercise_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int apple = 40;
		int avocado = 50;
		
		System.out.println("The price for apples are " + apple + "$/kg");
		System.out.println("The price for apples are " + avocado + "$/piece");
		System.out.println();
		
		Scanner myscanner = new Scanner(System.in);
		
		System.out.println("How many Kg of Apples do you want to buy?");
		int appleAmount = myscanner.nextInt();
		System.out.println();
		
		System.out.println("How many Avokados do you want to buy?");
		int avocadoAmount = myscanner.nextInt();
		System.out.println();
		
		int price = ((apple * appleAmount) + (avocado * avocadoAmount));
		
		System.out.println("The total amount is: " + price + "$");
		
		myscanner.close();
	}

}
