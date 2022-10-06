package exercise_2;

public class Exercice_006 {

	public static void main(String[] args) {
		double[] num = { 4, 5, 2, 8, 7, 9, 1, 6, 3, 10 };
		System.out.println(arrayAverage(num));
	}

	static double arrayAverage(double[] arr) {
		double x = 0;
		for (int i = 0; i < arr.length; i++) {
			x += arr[i];
		}
		x = x / arr.length;
		return x;
	}
}
