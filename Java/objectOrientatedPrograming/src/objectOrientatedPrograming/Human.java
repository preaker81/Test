package objectOrientatedPrograming;

class Human {
	String name;
	int age;
	int height;

	Human(String name, int age, int height){
		this.name = name;
		this.age = age;
		this.height = height;
		}
	
	void talk(String speak) {
		System.out.println(name + " says: " + speak);
	}
}
