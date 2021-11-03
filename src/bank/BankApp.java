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
			System.out.println("Withdrawn");
		}
	}
























}