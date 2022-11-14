package trudvangDamage;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		// Armor ARGS: PV, BV, HEFT, MM, IM
		Armor thickFabric = new Armor(1, 10, 1, 0, 0);
		Armor furAndLeather = new Armor(2, 20, 2, -1, -1);
		Armor hardenedLeather = new Armor(3, 30, 3, -1, -1);
		Armor metalReinforcedLeather = new Armor(4, 40, 4, -1, -1);
		Armor chainMail = new Armor(5, 50, 5, -2, -2);
		Armor scaleReinforcedChainMail = new Armor(6, 60, 6, -2, -2);
		Armor scalePlating = new Armor(7, 70, 7, -2, -3);
		Armor doubleChainMail = new Armor(8, 80, 8, -3, -3);
		Armor bandedArmor = new Armor(9, 90, 9, -3, -4);
		Armor plateArmor = new Armor(10, 100, 10, -4, -5);
		
		// Shield ARGS: WA, IM, PP, PV, BV
		Shield small = new Shield (3, -1, 2, 4, 40);
		Shield medium = new Shield (2, -2, 4, 5, 50);
		Shield large = new Shield (1, -3, 6, 6, 60);
		
		// ShieldReinforcment ARGS: PV, BV
		ShieldReinforcment furLeatherReinforce = new ShieldReinforcment(1, 10);
		ShieldReinforcment metalReinforce = new ShieldReinforcment(2, 20);

		
		Scanner sc = new Scanner(System.in);
		System.out.println("How much damage did you do?");
		int dmgInput = sc.nextInt();
		
		System.out.println("You did " + (dmgInput - thickFabric.pv) + " damage after armor");
		
	}

}
