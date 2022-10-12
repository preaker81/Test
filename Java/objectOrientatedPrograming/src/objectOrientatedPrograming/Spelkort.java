package objectOrientatedPrograming;

class Spelkort {
	String color;
	String sign;
	int value;
	
	
	Spelkort (String color, String sign, int value){
		this.value = value;
		this.color = color;
		this.sign = sign;
	}
	
	void display() {
		System.out.println(sign + " of " + color + "[" + value +"]");
	}
}