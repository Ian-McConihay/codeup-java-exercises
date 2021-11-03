package bank;

import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
//		Creating the obj Bank Account
	BankAccount obj1 = new BankAccount("Ian","8008S");
	obj1.showMenu();


//	Nested CLasses
//	It's a logical way of grouping classes that need to be used in one place
//	Nested classes increase encapsulation and allow the code to be read easier and maintainable



	}
}


class BankAccount{
	int balance;
	int previousTransaction;
	String customerName;
	String customerID;

//	Constructor same name as class
	BankAccount(String cName, String cID){
		customerID = cID;
		customerName = cName;
	}

	void deposit(int amount){
		if(amount != 0){
			balance = balance + amount;
			previousTransaction = amount;
		}
	}
	void withdrawal(int amount){
		if(amount != 0 && amount <= balance){
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

	void showMenu() {
		char option = '\0';
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome " + customerName);
		System.out.println("Your ID is: " + customerID);
		System.out.println("\n");
			do {
		System.out.println("A. Check Balance");
		System.out.println("B. Deposit");
		System.out.println("C. Withdraw");
		System.out.println("D. Previous transaction");
		System.out.println("E. Exit");

			System.out.println("====================");
			System.out.println("Select a menu option");
			System.out.println("====================");
			option = scanner.next().charAt(0);
//			System.out.println("\n");

			switch (option) {
				case 'A':
					System.out.println("Balance = " + balance);
					break;
				case 'B':
					System.out.println("Enter an amount to Deposit:");
					int amount = scanner.nextInt();
					deposit(amount);
					break;
				case 'C':
					System.out.println("Enter a Withdraw amount: ");
					int amountOne = scanner.nextInt();
					withdrawal(amountOne);
					break;
				case 'D':
					System.out.println("Your Previous transaction was: ");
					getPreviousTransaction();
					break;
				case 'E':
					System.out.println("===========================");
					break;
				default:
					System.out.println("Invalid Option. Please Enter a valid menu option");
					break;
			}
		} while (option != 'E');
		System.out.println("Thank You for banking with TITAN");
	}




















}