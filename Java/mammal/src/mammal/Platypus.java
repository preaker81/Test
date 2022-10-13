package mammal;

class Platypus extends Mammal {
	int beakLength;
	private int amountOfEggs = 0;
	
	Platypus(int beakLength, double weight){
		super(weight);
		this.beakLength = beakLength;
	}
	
	void click() {
		System.out.println("klick, klick, klick rrrrrrr");
	}
	
	void layEgg() {
		amountOfEggs++;
	}
	int getLayedEggs() {
		return amountOfEggs;
	}
}
