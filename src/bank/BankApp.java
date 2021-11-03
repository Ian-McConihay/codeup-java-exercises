package bank;

import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {





	}
}
class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;

//	Constroctor same name as class
	BankAccount(String customerName, String customerID){
		customerID = customerID;
		customerName = customerName;
	}

	void deposite(int amount){
		if(amount != 0){
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	void withdrawl(int amount){
		if(amount != 0){
			balance = balance - amount;
			previousTransaction = -amount;
		}
	}

	void getPreviousTransaction(){
		if(previousTransaction > 0){
			System.out.println("Deposited: " + previousTransaction);
		} else if(previousTransaction < 0){
			System.out.println("Withdrawn: " +Math.abs(previousTransaction));
		} else {
			System.out.println("No transaction occurred");
		}
	}

	void showMenu(){
	char option = '\0';
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is: " + customerID);
		System.out.println("\n");
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");

		do {
		System.out.println("====================");
		System.out.println("Select a menu option");
		System.out.println("====================");
		option = scanner.next().charAt(0);
		System.out.println("\n");

		switch (option){
			case 'A':
				System.out.println("Balance = "+balance);
				break;
			case 'B':
				System.out.println("Enter an amount to deposit:");
				int amount = scanner.nextInt();
				deposite(amount);
				break;
			case 'C':


	}






















}