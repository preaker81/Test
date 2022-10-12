package oop2;

class SavingsAccount extends BankAccount{
	double intrest;
	
	SavingsAccount(double intrest, double deposit, double whitdraw, double balance){
		super(deposit, whitdraw, balance);
		this.intrest = intrest;
	}
	
	void depositIntrest(double deposit, double intrest) {
		balance = (balance + deposit)*intrest;
		System.out.println("You deposited: " + deposit + "kr");
	}

}
