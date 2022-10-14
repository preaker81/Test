package oop2;

class BankAccount {

	double deposit;
	double whitdraw;
	private double balance;

	BankAccount(double balance) {
		this.balance = balance;

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
	
	double getBalance() {
		return balance;
	}
	
	double setBalance(double balance) {
		return this.balance = balance;
	}
}