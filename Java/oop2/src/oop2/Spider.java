package oop2;

class Spider extends Husdjur {
	
	
	Spider(String name, String color){
		super(name, color);
	}
	
	void hungry() {
		System.out.println(name + " is hungry");
	}
	
	void fetch() {
		System.out.println(name + " catches the dog");
	}

}
