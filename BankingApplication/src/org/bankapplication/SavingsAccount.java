package org.bankapplication;

public class SavingsAccount extends BankAccount {

	private static final double MIN_Balance = 500;

	public SavingsAccount(String accountNumber, String accountHolderName, double balance) {
		super(accountNumber, accountHolderName, balance);
	}

	@Override
	public void withdraw(double amount) {
		if (balance - amount >= MIN_Balance) {
			balance = balance - amount;
			System.out.println("Withdrawal amount of " + amount + " is successful");
		} else {
			System.out.println("Insufficient Funds");
		}
	}

	@Override
	public void deposit(double amount) {

		balance = balance + amount;
		System.out.println("Deposited " + amount + " in Your Account");

	}

}
