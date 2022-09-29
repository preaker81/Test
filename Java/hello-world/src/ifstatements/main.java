package ifstatements;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 66;
		
		if(age < 20) {
			System.out.println("Köp mjölk!");
		}
		
		else if (age >= 20 && age < 65) {
			System.out.println("Välkommen in på systemet!");
		}
		
		else {
			System.out.println("Ring farfar!");
		}

	}

}
