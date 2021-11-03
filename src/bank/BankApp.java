package bank;

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

	}






















}