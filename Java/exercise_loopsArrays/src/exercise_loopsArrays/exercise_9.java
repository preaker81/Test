package exercise_loopsArrays;

import java.util.Random;

public class exercise_9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] nameList = { "ida", "jimmy", "johan", "frida", "gunnar", "tommy", "jenny", "annika", "linn",
				"arzije" };

		for (int i = 0; i < 15; i++) {
			int rnd = new Random().nextInt(nameList.length);
			System.out.println(nameList[rnd]);
		}

	}

}
