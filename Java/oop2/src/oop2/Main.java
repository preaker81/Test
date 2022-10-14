package oop2;

public class Main {

	public static void main(String[] args) {
	Dogs dog1 = new Dogs("Charlie", "Brown");
	Spider spider1 = new Spider("Sprinkles", "pink");
	
	dog1.sit();
	dog1.fetch();
	System.out.println();
	spider1.hungry();
	spider1.fetch();
	spider1.sleeping();
	
	
	SavingsAccount account1 = new SavingsAccount(0, 0);
	account1.balance();
	
	account1.depositIntrest(100, 0.1);
	System.out.println(account1.getBalance());

	
	System.out.println("""
			asdfasdgasdg
			asdfasdfa
			sadfadsfgasdfadf
			adfadsf
			""");
	}

}
