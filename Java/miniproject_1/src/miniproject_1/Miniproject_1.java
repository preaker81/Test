package miniproject_1;

import java.util.Random;
import java.util.Scanner;

public class Miniproject_1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Random random = new Random();
//		String exit = "y";
		
		while (true) {
			int randomNumber = random.nextInt(100)+1;
			int tryCount = 0;
//			System.out.println(randomNum);
			System.out.println("This is a Guess the number game!");
			

			
			while (true) {
				System.out.println("Enter a number between 1 - 100");
				int playerGuess = sc.nextInt();
				
				int result = trueOrFalse(playerGuess, randomNumber);
				tryCount++;

				if (result == 1) {
					System.out.println("You where correct and you needed " + tryCount + " tries!");
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
            System.out.println("Do you want to play again? (y/n):");
            String input = sc.next();
            if (!input.equals("y")) {
                break;
            }

		}

	}

	static int trueOrFalse(int x, int y) {

		int result = 0;

		if (x == y) {
			result = 1;
		}

		else if (x > y) {
			result = 2;
		}

		return result;

	}

}
