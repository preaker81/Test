package oop2;

class BankAccount {

	double deposit;
	double whitdraw;
	double balance;

	BankAccount(double balance, double deposit, double whitdraw) {
		this.balance = balance;
		this.deposit = deposit;
		this.whitdraw = whitdraw;
	}

	// Metoder
	void deposit(double deposit) {
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