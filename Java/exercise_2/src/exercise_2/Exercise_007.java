package exercise_2;

import java.util.Scanner;

public class Exercise_007 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Celsius to Fahrenheit Converter");
		System.out.println("Give me the heat!: ");
		double temp = sc.nextDouble();
		sc.close();
		
		System.out.println(celsiusToFahrenheit(temp));

	}

	static double celsiusToFahrenheit (double x) {
		return (x*1.8) + 32;
	}
}