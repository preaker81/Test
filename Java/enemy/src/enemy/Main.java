package enemy;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Enemy goon1 = new Enemy("Grunt", 10);

		while (true) {
			int input = sc.nextInt();
			goon1.attack(input - 1);
		}
	}

}
