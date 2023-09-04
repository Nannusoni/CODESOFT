package JAVA_PROJECT;

import java.util.Scanner;

public class AtmInterface {
	int balance;

	public AtmInterface(int initialBalance) {
		balance = initialBalance;
	}

	//1. method to check balance
	public void checkBalance() {
		System.out.println("Hello!Dear");
		System.out.println("Your balance is " + balance);
	}

	// 2. method to deposit amount
	public void deposit(int amountToDeposit) {
		balance = amountToDeposit + balance;
		System.out.println("You just deposited " + amountToDeposit);
		System.out.println("Your Total balance is " + balance);
	}

	// 3. method for withdraw amount
	public int withdraw(int amountToWithdraw) {
		balance = balance - amountToWithdraw;
		System.out.println("You just withdrew " + amountToWithdraw);
		System.out.println("Your Total balance is " + balance);
		return amountToWithdraw;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		SavingAccount savings = new SavingAccount(1000);
		// Check balance:
		savings.checkBalance();
		// Deposit:
		
		System.out.println("\n Enter the amount you want to deposit: ");
		int amountToDeposit = scanner.nextInt();
		savings.deposit(amountToDeposit);
		// Withdrawing:
		System.out.println("\n Enter the amount you want to withdraw: ");
		int amountToWithdraw = scanner.nextInt();
		savings.withdraw(amountToWithdraw);
	
		
		
		
	}
}
