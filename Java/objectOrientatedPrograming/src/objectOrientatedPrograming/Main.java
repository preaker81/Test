package objectOrientatedPrograming;

public class Main {

	public static void main(String[] args) {

		//TODO #1
		Husdjur husdjur = new Husdjur("Charlie", "Dog", "Black");
		
		System.out.println(husdjur.name + " " + husdjur.type + " "  + husdjur.color);
		
		//TODO #2
		Bankkonto bankkonto1 = new Bankkonto(299);
		
		bankkonto1.deposit(500);
		
		bankkonto1.whitdraw(800);
		
		bankkonto1.balance();
		
		//TODO #3
		
//		Spelkort QueenOfHearts = new Spelkort("D", "Hearts");
//		System.out.println(QueenOfHearts.value);
		
		//TODO #4
		
		Spelkort[] deck = new Spelkort[52];
		String[] suits = {"Hearts", "Clubs", "Diamonds", "Spades"};
		String[] signs = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Kn", "Q", "K", "Ace"};
		
		int deckIndex = 0;
		
		for(int i = 0; i<suits.length; i++) {
			for(int j=0; j<signs.length; j++) {

				deck[deckIndex] = new Spelkort(suits[i], signs[j]);
				deckIndex++;
			}
		}
		for(int z = 0; z<deck.length; z++) {
			deck[z].display();
		}

		
	}

}
