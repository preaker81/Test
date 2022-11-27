package humbug;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		for (int i = 1; i <= 100; i++) {
//
//			if ((i % 3 == 0) && (i % 5 == 0)) {
//				System.out.println("Humbug");
//			}
//			else if (i % 3 == 0) {
//				System.out.println("Hum");
//			}
//			else if (i % 5 == 0) {
//				System.out.println("Bug");
//			}
//			else {
//				System.out.println(i);
//			}

			String output = "";

			if (i % 3 == 0) {
				output += "Fizz";
			}
			if (i % 5 == 0) {
				output += "Buzz";
			}
			if (output == "") {
				output = "" + i;
			}

			System.out.println(output);

		}
	}
}
