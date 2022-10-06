package miniproject_1;

import java.util.Scanner;

public class Miniproject_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		do {
			int randomNum = (int) Math.round(Math.random() * 100);
			System.out.println(randomNum);
			System.out.println("This is a Guess the number game!");

			int guesses = 0;
			while (true) {
				System.out.println("Enter a number between 1 - 100");
				int playerGuess = sc.nextInt();
				int result = trueOrFalse(playerGuess, randomNum);
				guesses++;

				if (result == 1) {
					System.out.println("You where correct and you needed " + guesses + " tries!");
					System.out.println("");
					break;
				}

				else if (result == 2) {
					System.out.println("No, you need to go lower!");
				}

				else {
					System.out.println("Nope, you need a higher number!");
				}

			}

		} while (true);

	}

	static int trueOrFalse(int x, int y) {

		int result = 0;

		if (x == y) {
			result = 1;
		}

		else if (x > y) {
			result = 2;
		}

		else {
			result = 3;
		}

		return result;

	}

}
