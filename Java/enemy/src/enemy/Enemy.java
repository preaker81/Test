package enemy;

import java.util.Random;

class Enemy {
	String enemyName;
	int[][] weaponDmg = {{3, 5}};
	String[] weapon = {"Axe", "Sword", "Spear"};
	int energyLevel;
	int userChoice;

	Enemy(String enemyName, int energyLevel) {
		this.enemyName = enemyName;
		this.energyLevel = energyLevel;
		

	}
	Random random = new Random();

	// metods
	void attack(int userChoice) {
		int damage = random.nextInt(6)+1;
		System.out.println("Attack whit " + weapon[userChoice] + " for " + damage +" damage");
	}


}
