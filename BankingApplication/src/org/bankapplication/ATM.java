package org.bankapplication;

public class ATM {
	public static int total_transaction;

	static {
		total_transaction = 0;
		System.out.println("ATM System Initated");

	}

	public static void performtransaction(BankAccount account, String type, double amount) {

		switch (type.toLowerCase()) {

		case "withdraw":
			account.withdraw(amount);
			total_transaction++;
			break;

		case "deposit":
			account.deposit(amount);
			total_transaction++;
			break;

		default:
			System.out.println("Invalid Transaction Type ");
		}
	}

	public static void main(String[] args) {

	}
}
