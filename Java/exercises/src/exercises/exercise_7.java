package exercises;

import java.util.Scanner;

public class exercise_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myscanner = new Scanner(System.in);

		System.out.println("Give me a number between 0 and 10.");
		int userInput = myscanner.nextInt();

		if (userInput > 10 && userInput < 0) {
			System.out.println("I said between 0 and 10! The number yo gave where: " + userInput);
		}

		else {
			while (userInput <= 10) {
				System.out.println(userInput);
				userInput++;
			}
		}
		myscanner.close();

	}

}
