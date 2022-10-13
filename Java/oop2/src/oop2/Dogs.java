package oop2;

class Dogs extends Husdjur {

	
	Dogs(String name, String color){
		super(name, color);
	}
	
	void sit() {
		System.out.println(name + " sits down.");
	}
	
	void fetch() {
		System.out.println(name + " fetches the stick");
	}

}
