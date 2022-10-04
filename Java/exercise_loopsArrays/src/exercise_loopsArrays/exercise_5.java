package exercise_loopsArrays;

public class exercise_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int rand = 0;
		
		while (rand <=52 || rand >=68) {
			rand = (int) Math.round(Math.random()*100);
			System.out.println(rand);
		}
	}

}
