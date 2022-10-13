package exercise_2;

import java.util.Scanner;

public class Exercise_001 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("I need 2 numbers to divide!");
		System.out.println("Number 1:");
		int value1 = sc.nextInt();
		System.out.println("Number 2:");
		int value2 = sc.nextInt();
		int result = divide(value1, value2);
		System.out.println("The result is: " + result);

		sc.close();
	}

	static int divide(int x, int y) {
		return x / y;
	}

}
