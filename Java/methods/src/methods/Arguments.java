package methods;

import java.util.Scanner;

public class Arguments {

	public static void main(String[] args) {
//		numberOfDogs(5, "Staff");
//		numberOfDogs(10, "Pitbull");

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Hur många gånger vill du printa?: ");
		int times = sc.nextInt();
		
		print(times);

	}

	static void numberOfDogs(int amount, String race) {
		System.out.println("The amount of " + race + " is " + amount);
	}
	
	static void print(int amount) {
		for(int i = 0; i <amount; i++) {
			System.out.println("Hej");
		}
	}
}
