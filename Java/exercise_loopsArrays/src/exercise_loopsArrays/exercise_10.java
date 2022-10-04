package exercise_loopsArrays;

import java.util.Random;

public class exercise_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nameList = { "ida", "jimmy", "johan", "frida", "gunnar", "tommy", "jenny", "annika", "linn",
				"arzije" };
		int[] apperance = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < 15; i++) {
			int rnd = new Random().nextInt(nameList.length);
			apperance[rnd] += 1;
			System.out.println(nameList[rnd]);
		}

		System.out.println("------------------------------------------");

		for (int j = 0; j < 10; j++) {
			System.out.println(nameList[j] + " - " + apperance[j]);
		}

	}

}
