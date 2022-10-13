package methods;

import java.util.Scanner;

public class Return {

	public static void main(String[] args) {

//		int result = multiply(6, 9);
//		System.out.println(result);
//		
//		double resultD = divide(3, 5);
//		System.out.println(resultD);

		
		
		boolean resultIsOdd = isOdd(8);
		System.out.println(resultIsOdd);
	}

//	static int multiply(int x, int y) {
//		return x*y;
//	}
//	
//	static double divide(double x, double y) {
//		return x/y;
//	}

	static boolean isOdd(int x) {
		return x%2 == 1;
	}

}
