package exercises;

import java.util.Scanner;

public class exercise_classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner myscanner = new Scanner(System.in);
//		System.out.println("Give me a number");
		
//		int i = myscanner.nextInt();
//		while (i <=10) {
//			System.out.println(i);
//			i++;
//		}
		
		
//		int input = myscanner.nextInt();
//		for (int i=0; i<=input; i++) {
//			System.out.println(i+1);
//		}
		
		
//		int input = 0;
//		while(input != 5) {
//			System.out.println("Give me a number!");
//			input = myscanner.nextInt();
//		}
		

//		myscanner.close();
		
		
		int[] numbers = {1, 4, 7, 10, 13, 16};
		int sum = 0;
		
		for (int num : numbers) {
			System.out.println(num);
			sum = sum + num;
			
			System.out.println("The total sum is:" + sum);
		}
		
		
		
		
	}

}
