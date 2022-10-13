package exercise_2;

public class Exercise_005 {

	public static void main(String[] args) {

		int[] num = { 4, 5, 2, 8, 7, 9, 1, 6, 3, 2 };
		
		System.out.println(compare(num));
		
	}

	static int compare(int[] arr) {
		int x = 0;
		for (int i = 0; i <arr.length; i++) {
			if(x < arr[i]) {
				x = arr[i];
			}
		}
		return x;
	}
}
