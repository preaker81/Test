package objectOrientatedPrograming;

import java.util.Objects;

class Mammal {
	String family;
	String sound;
	int weight;
	int numberOfLegs;
	int energy = 50;
	int talk;
	boolean standingOnTwoLegs;
	boolean breastFeeding = true;
	
	Mammal(String family, String sound, int weight, int numberOfLegs, boolean standingOnTwoLegs, boolean breastFeeding){
		this.weight = weight;
		this.family = family;
		this.numberOfLegs = numberOfLegs;
		this.standingOnTwoLegs = standingOnTwoLegs;
	}
	
	void sleep (int hours) {
		energy = energy + (5*hours);
	}
	
	void talk (String talk) {
		if(Objects.equals(talk, sound));
	}
	
	void sound (String sound) {
		System.out.println(sound);
	}
	
}
