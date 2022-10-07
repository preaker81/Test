package javaBasics1;

public class JavaBasics1_001 {

	public static void main(String[] args) {
		// TODO #1
		System.out.println("Hello World");
		System.out.println("-----------------------------------------------");
		//TODO #2
		int add = 74 + 36;
		System.out.println(add);
		System.out.println("-----------------------------------------------");
		//TODO #3
		int divide = 50 / 3;
		System.out.println(divide);
		System.out.println("-----------------------------------------------");
		//TODO #4
		int a = (-5+(8*6));
		System.out.println("a: " + a);
		
		int b = ((55+9)%9);
		System.out.println("b: " + b);
		
		int c = 20 + ((-3*5)/8);
		System.out.println("c: " + c);
		
		int d = 5 + 15/3 * 2 - 8%3;
		System.out.println("d: " + d);
		System.out.println("-----------------------------------------------");
		//TODO #5
		int inputFirst = 25;
		int inputSecond = 5;
		System.out.println(inputFirst*inputSecond);
		System.out.println("-----------------------------------------------");
		//TODO #6
		int firstNumber = 125;
		int secondNumber = 24;
		System.out.println(firstNumber+secondNumber);
		System.out.println(firstNumber-secondNumber);
		System.out.println(firstNumber*secondNumber);
		System.out.println(firstNumber/secondNumber);
		System.out.println(firstNumber%secondNumber);
		System.out.println("-----------------------------------------------");
		//TODO #7
		int multiplyEight = 8;
		for(int i = 1; i<11; i++) {
			System.out.println(multiplyEight*i);
		}
		System.out.println("-----------------------------------------------");
		//TODO #8
		System.out.println("""
				   J    a   v     v   a
				   J   a a   v   v   a a
				J  J  aaaaa   V V   aaaaa
				 JJ  a     a   V   a     a
				""");
		System.out.println("-----------------------------------------------");
		//TODO #9
		System.out.println(((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)));
		System.out.println("-----------------------------------------------");
		//TODO #10
		System.out.println(4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11)));
		System.out.println("-----------------------------------------------");
		//TODO #11
		double radius = 7.5;
		double pi = Math.PI;
		
		System.out.println("The parimeter is: " + (radius*(pi*2)));
		System.out.println("The area is: " + (pi*(radius*radius)));
		
		System.out.println("-----------------------------------------------");
		//TODO #12
		int[] numbers = {2, 3, 4};
		double average = 0;
		
		for(int i=0; i<numbers.length; i++) {
			average += numbers[i];
		}
		System.out.println(average/numbers.length);
		System.out.println("-----------------------------------------------");
		//TODO #13
		double width = 5.5;
		double height = 8.5;
		
		System.out.println(width*height);
		System.out.println(2*(width+height));
		System.out.println("-----------------------------------------------");
		//TODO #14
		System.out.println("""
				* * * * * * ==================================                          
				 * * * * *  ==================================                          
				* * * * * * ==================================                          
				 * * * * *  ==================================                          
				* * * * * * ==================================                          
				 * * * * *  ==================================                          
				* * * * * * ==================================                          
				 * * * * *  ==================================                          
				* * * * * * ==================================                          
				==============================================                          
				==============================================                          
				==============================================                          
				==============================================                          
				==============================================                          
				==============================================
				""");
		System.out.println("-----------------------------------------------");
		//TODO #15
		int variable1 = 3;
		int variable2 = 4;
		int temp = 0;
		System.out.println(variable1 + " " + variable2);
		temp = variable1;
		variable1 = variable2;
		variable2 = temp;
		System.out.println(variable1 + " " + variable2);
		System.out.println("-----------------------------------------------");
		//TODO #16
		System.out.println(" +\"\"\"\"\"+");
		System.out.println("[| o o |]");
		System.out.println(" |  ^  |");
		System.out.println(" | '-' | ");
		System.out.println(" +-----+ ");
		System.out.println("-----------------------------------------------");
		//TODO #17
		int vari1 = 2;
		int vari2 = 3;
		System.out.println(Integer.toBinaryString(vari1+vari2));
		System.out.println("-----------------------------------------------");
		//TODO #18
		int vari3 = 2;
		int vari4 = 3;
		System.out.println(Integer.toBinaryString(vari3*vari4));
		System.out.println("-----------------------------------------------");
		//TODO #19
		System.out.println("-----------------------------------------------");
		//TODO #20
		System.out.println("-----------------------------------------------");
		//TODO #21
		System.out.println("-----------------------------------------------");
		//TODO #22
		System.out.println("-----------------------------------------------");
		//TODO #23
		System.out.println("-----------------------------------------------");
		//TODO #24
		
		
	}

}
