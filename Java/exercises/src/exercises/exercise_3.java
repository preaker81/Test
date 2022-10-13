package exercises;

import java.util.Scanner;

public class exercise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner myscanner = new Scanner(System.in);
		System.out.println("What is your age?");
		int Age = myscanner.nextInt();

		System.out.println("What is your name?");
		String Name = myscanner.next();

		System.out.println("What do you like to do?");
		String Activity = myscanner.next();

		System.out.println("Hi " + Name + ", your age is " + Age + ". Your activity of choice is " + Activity);

		myscanner.close();
	}

}
