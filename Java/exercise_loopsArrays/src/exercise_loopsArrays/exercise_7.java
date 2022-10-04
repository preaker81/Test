package exercise_loopsArrays;

import java.util.Scanner;

public class exercise_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myscanner = new Scanner(System.in);
		System.out.println("Give me a word: ");
		String input = myscanner.nextLine();
		
		int wordLength = 3;
		
		while (input.length() >= wordLength) {
			System.out.println("Give me another word: ");
			myscanner.nextLine();
			
		}
		
		
		
		
		myscanner.close();
	}

}
