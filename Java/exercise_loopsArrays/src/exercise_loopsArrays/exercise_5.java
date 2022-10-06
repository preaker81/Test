package exercise_loopsArrays;

public class exercise_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rand = (int) Math.round(Math.random() * 100);

		while (rand <= 52 || rand >= 68) {
			System.out.println(rand);
			rand = (int) Math.round(Math.random() * 100);
		}
	}

}
