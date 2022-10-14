package oop2;

class SavingsAccount extends BankAccount{
	private double intrest;
	
	SavingsAccount(double balance , double intrest){
		super(balance);
		this.intrest = intrest;
	}
	
	void depositIntrest(double deposit, double intrest) {
		double newBalance = getBalance() + deposit + (deposit*intrest);
		setBalance(newBalance);
		System.out.println("You deposited: " + deposit + "kr");
	}

}
