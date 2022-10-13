package exercise_2;

public class Exercise_003 {

	public static void main(String[] args) {
		int[] num = { 4, 5, 2, 8, 7, 9, 1, 6, 3, 10 };

//		int result = additionArray(num);
		System.out.println(additionArray(num));

	}

	static int additionArray(int[] arr) {
		int x = 0;
		for (int i = 0; i <arr.length; i++) {
			x += arr[i];
		}
		return x;
	}

}