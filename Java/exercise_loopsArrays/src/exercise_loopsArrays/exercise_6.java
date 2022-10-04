package exercise_loopsArrays;

import java.util.Scanner;

public class exercise_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myscanner = new Scanner(System.in);
		System.out.println("Give me a number: ");

		int input = myscanner.nextInt();
		int rand = (int) Math.round(Math.random() * 100);

		while (input >= rand) {
			System.out.println(rand);
			rand = (int) Math.round(Math.random() * 100);
			input = myscanner.nextInt();
		}
		myscanner.close();
	}

}
