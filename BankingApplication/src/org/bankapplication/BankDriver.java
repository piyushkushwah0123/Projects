package org.bankapplication;

public class BankDriver {

	public static void main(String[] args) {
		
		BankAccount ba = new SavingsAccount(" 9983828", "Rakesh", 1000);
		
		ATM.performtransaction(ba, "withdraw" , 200);
		
		ba.displayBalance();
		
		System.out.println("...........................");
		
		ATM.performtransaction(ba, "deposit", 1000.00);
		
		ba.displayBalance();
		
		System.out.println("Total Transaction ::"+ATM.total_transaction);
	}
}
