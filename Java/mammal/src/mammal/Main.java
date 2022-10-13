package mammal;

public class Main {

	public static void main(String[] args) {
		System.out.println("______Mammal______");
		Mammal m = new Mammal (100);
		m.breath();

		System.out.println("______Whale______");
		Whale w = new Whale(87, 120, 500.5);
		w.breath();
		w.sing();
		
		System.out.println("______Platypus______");
		Platypus p = new Platypus(4, 2.4);
		p.breath();
		p.click();
		p.layEgg();
		System.out.println(p.getLayedEggs());
	}

}
