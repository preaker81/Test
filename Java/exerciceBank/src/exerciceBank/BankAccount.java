package exerciceBank;

class BankAccount {
	int balance;
	
	BankAccount(int balance){
		this.balance = balance;
	}
	
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
