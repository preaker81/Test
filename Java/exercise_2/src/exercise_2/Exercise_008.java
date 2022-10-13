package exercise_2;

import java.util.Scanner;

public class Exercise_008 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Fahrenheit to Celsius Converter");
		System.out.println("Give me the heat!: ");
		double temp = sc.nextDouble();
		sc.close();
		
		System.out.println(fahrenheitToCelsius(temp));

	}

	static double fahrenheitToCelsius (double x) {
		return (x-32) / 1.8;
	}
}