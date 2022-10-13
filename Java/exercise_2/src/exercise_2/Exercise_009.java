package exercise_2;

import java.util.Scanner;

public class Exercise_009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("""
					1. Addition
					2. Average
					3. Max Value
					----------------
					Choose what to do:
					""");

			int choice = sc.nextInt();
			System.out.println("You have choosen" + choice);

			switch (choice) {
			case 1:
				System.out.println("Enter the first Integer:");
				int x = sc.nextInt();
				System.out.println("Enter the second Integer:");
				int y = sc.nextInt();
				System.out.println(addition(x, y));
				break;
				
			case 2:
				System.out.println("How many numbers do you want to enter?");
				int rangeAverage = sc.nextInt();
				int[] argAverageArray = new int[rangeAverage];
				for (int i = 0; i < argAverageArray.length; i++) {
					System.out.println("Please eneter a number");
					argAverageArray[i] = sc.nextInt();
				}
				System.out.println(averageArray(argAverageArray));
				break;
				
			case 3:
				System.out.println("How many numbers do you want to enter?");
				int rangeMax = sc.nextInt();
				int[] argMaxArray = new int[rangeMax];

				for (int i = 0; i < argMaxArray.length; i++) {
					System.out.println("Please eneter a number");
					argMaxArray[i] = sc.nextInt();
				}
				System.out.println(maxArray(argMaxArray));
				break;
			}
			sc.close();
		}

	}

	static int addition(int x, int y) {
		return x + y;
	}

	static double averageArray(int[] arr) {
		double x = 0;
		for (int i = 0; i < arr.length; i++) {
			x += arr[i];
		}
		x = x / arr.length;
		return x;
	}

	static int maxArray(int[] arr) {
		int x = 0;
		for (int i = 0; i < arr.length; i++) {
			if (x < arr[i]) {
				x = arr[i];
			}
		}
		return x;
	}
}
