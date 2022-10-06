package exercise_2;

import java.util.Scanner;

public class Exercise_004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give me a number:");
		int num1 = sc.nextInt();
		System.out.println("Give me another number:");
		int num2 = sc.nextInt();
		
		System.out.println("The bigger number is: " + compare(num1, num2));
		
		sc.close();
	}

	
	static int compare(int x, int y) {

		if (x>y) {
			return x;
		}
		
		else {
			return y;
		}
	}
}
