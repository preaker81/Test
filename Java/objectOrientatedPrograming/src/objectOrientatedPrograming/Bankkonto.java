package objectOrientatedPrograming;

class Bankkonto {

	int deposit;
	int whitdraw;
	int balance;

	Bankkonto(int balance) {
		this.balance = balance;
	}

	// Metoder
	void deposit(int deposit) {
		balance += deposit;
		System.out.println("You deposited: " + deposit + "kr");
	}

	void whitdraw(int whitdraw) {
			balance -= whitdraw;
			System.out.println("You whitdrawed: " + whitdraw + "kr");
	}

	void balance() {
		System.out.println("Your balance is: " + balance + "kr");
	}
}
