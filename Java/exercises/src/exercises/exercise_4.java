package exercises;

import java.util.Scanner;

public class exercise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myscanner = new Scanner(System.in);
		System.out.println("Give me a number:");
		int numberOne = myscanner.nextInt();

		System.out.println("Give me another number:");
		int numberTwo = myscanner.nextInt();

		if (numberOne > numberTwo) {
			System.out.println("Det största numret är: " + numberOne);
		}

		else {
			System.out.println("Det största numret är: " + numberTwo);
		}

		myscanner.close();
	}

}
