package exerciceBank;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount account1 = new BankAccount(2000000);
		account1.balance();
		account1.whitdraw(1000000);
		account1.balance();
		
		BankAccount account2 = new BankAccount(200);
		account2.balance();
		account2.deposit(1000000);
		account2.balance();
	}

}
