package mammal;

class Whale extends Mammal{
	int finLength;
	int blowLength;
	
	Whale(int finLength, int blowLength, double weight){
		super(weight);
		this.finLength = finLength;
		this.blowLength = blowLength;
	}
	
	void sing() {
		System.out.println("ooooooOOOoOOOOooooOOO");
	}

}
