package miniproject_1;

import java.util.Random;
import java.util.Scanner;

public class Miniproject_test {

	public static void main(String[] args) {

		while (true) {
			Scanner sc = new Scanner(System.in);
			Random random = new Random();

			int randomNumber = random.nextInt(101);
			int playerGuess = -1;

//			System.out.println(randomNumber);
			int tryCount = 0;

			System.out.println("This is a Guess the number game!");
			System.out.println("Enter a number between 1 - 100");

			while (!trueOrFalse(playerGuess, randomNumber)) {

				playerGuess = sc.nextInt();

				if (playerGuess > randomNumber) {
					System.out.println("No, you need to go lower!");
				}

				else if (playerGuess < randomNumber) {
					System.out.println("No, you need to go higher!");
				}
				tryCount++;
			}

			System.out.println("You are correct, and you did it in: " + tryCount + " tries!");
			System.out.println("----------------------------------------------------------");
			System.out.println("Do you want to play again? (y/n):");
			String exit = sc.next();
			if (!exit.equals("y")) {
				break;
			}
		}

	}

	static boolean trueOrFalse(int x, int y) {

		return x == y;
	}
}