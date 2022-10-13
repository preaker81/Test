package hangman_game;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Hangman_game {

	public static void main(String[] args) throws Exception {
		
		while(true) {
		System.out.println("Welcome to Hangman, the dictionary contains 180k english words");
		File dictionary = new File("/Git/Test/Java/hangman_game/src/english3.txt");

		Scanner textScanner = new Scanner(dictionary);
		Scanner userInput = new Scanner(System.in);
		
		ArrayList<String> wordList = new ArrayList<>();
		
		while(textScanner.hasNext()) {
			wordList.add(textScanner.nextLine());
		}
		
		String randomWord = wordList.get((int)(Math.random()*wordList.size()));
		char[] textArray = randomWord.toCharArray();
		
		char[] playerAnswer = new char[textArray.length];
		for (int i =0; i < textArray.length; i++) {
			playerAnswer[i] = '?';
		}
		
		boolean finished = false;
		int lives = 6;
		
		while (finished == false) {
			System.out.println("********************************");
			System.out.println("Guess a letter!");
			
			String letter = userInput.next();
			while(letter.length() != 1 || !Character.isLetter(letter.charAt(0))) {
				System.out.println("Not a valid char, try again.");
				letter = userInput.next();
			}
			
			boolean found = false;
			for(int i = 0; i <textArray.length; i++) {
				if(letter.charAt(0) == textArray[i]) {
					playerAnswer[i] = textArray[i];
					found = true;
				}
			}
			
			if (!found) {
				lives--;
				
				System.out.println("Wrong Letter");
			}
			
			boolean done = true;
			for(int i = 0; i<playerAnswer.length; i++) {
				if(playerAnswer[i] == '?') {
					System.out.print(" _");
					done = false;
				}
				else {
					System.out.print(" " + playerAnswer[i]);
				}
			}
			System.out.println("\n" + "Lives left: " + lives);
			drawHangman(lives);
			
			if (done) {
				System.out.println("Congrats, you found the word! It was indeed: " + randomWord);
				finished = true;
			}
			
			if(lives <= 0) {
				System.out.println("You are dead! The word was: " + randomWord +". Try again.");
				finished = true;
			}
		}
//		textScanner.close();
//		userInput.close();
		}
	}
	
	public static void drawHangman(int x) {
		  if(x == 6) {
		   System.out.println("|----------");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		  }
		  else if(x == 5) {
		   System.out.println("|----------");
		   System.out.println("|    O");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		  }
		  else if(x == 4) {
		   System.out.println("|----------");
		   System.out.println("|    O");
		   System.out.println("|    |");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		  }
		  else if(x == 3) {
		   System.out.println("|----------");
		   System.out.println("|    O");
		   System.out.println("|   -|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		  }
		  else if(x == 2) {
		   System.out.println("|----------");
		   System.out.println("|    O");
		   System.out.println("|   -|-");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		  }
		  else if(x == 1) {
		   System.out.println("|----------");
		   System.out.println("|    O");
		   System.out.println("|   -|-");
		   System.out.println("|   /");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		  }
		  else{
		   System.out.println("|----------");
		   System.out.println("|    O");
		   System.out.println("|   -|-");
		   System.out.println("|   / \\");
		   System.out.println("|");
		   System.out.println("|");
		   System.out.println("|");
		  }
		 }
}
