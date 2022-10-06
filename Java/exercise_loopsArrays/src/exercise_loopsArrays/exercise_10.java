package exercise_loopsArrays;

import java.util.Random;

public class exercise_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] name = { "ida", "jimmy", "johan", "frida", "gunnar", "tommy", "jenny", "annika", "linn", "arzije" };
		int[] count = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = 0; i < 15; i++) {
			int rnd = new Random().nextInt(name.length);
			count[rnd]++;
			System.out.println(name[rnd]);
		}

		System.out.println("----------");

		for (int j = 0; j <name.length; j++) {
			if(count[j] > 0) {
				System.out.println(name[j] + " " + count[j]);
			}
		}

	}

}
