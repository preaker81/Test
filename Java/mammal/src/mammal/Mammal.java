package mammal;

class Mammal {
	final static boolean canBreastFeed = true;
	double weight;
	
	Mammal(double weight){
		this.weight = weight;
	}
	
	void breath() {
		System.out.println("Breathing in");
		System.out.println("Breathing out");
	}

}
