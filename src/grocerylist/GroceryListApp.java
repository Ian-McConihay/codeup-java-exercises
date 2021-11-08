package grocerylist;
import util.Input;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class GroceryListApp {
	public static void main(String[] args) {
//		HashMap<String, Student> students = new HashMap<>();

		Cart shoppinglist = new Cart("Ian",new ArrayList<>() );
		shoppinglist.showMenu();




	}
}


class Cart {
	private ArrayList<String> cart;
	String customerName;

	//	Constructor same name as class
	Cart(String customerName, ArrayList<String> cartItems) {
		this.customerName = customerName;
		this.cart = cartItems;
	}

	void addItem(String item) {
	cart.add(item);
	}

	void removeItem(String item) {
	cart.remove((String) item);
	}


	void showMenu() {
//		ArrayList<ArrayList<String>> categories = new ArrayList<>();
//		ArrayList<String> meatlist = new ArrayList();
//		meatlist.add("Fish");
//		meatlist.add("Beef");
//		meatlist.add("Chicken");

		boolean confirm = true;
		confirm = new Input().yesNo("Would you like tp make a grocery list? [y/N]");
		if(confirm == false)
			System.exit(0);
		System.out.println(confirm);




//		useDelimiter allows spaces to be used in a single string
		char option = '\0';
		Scanner scanner = new Scanner(System.in).useDelimiter("\n");

		System.out.println("\n Welcome " + customerName);
		do {
			System.out.println("A. Check Cart");
			System.out.println("B. Add Item");
			System.out.println("C. Remove Item");
			System.out.println("E. Finish list");

//			chatAt(0) allows the scanner to capture the char at position 0
			option = scanner.next().charAt(0);

			switch (option) {
				case 'A':
					System.out.println("Check Cart = " + cart);
					break;
				case 'B':
					System.out.println("Enter an item to add to cart:");
					String item = scanner.next();
//					String name ="";
//					name+=scanner.next();
					addItem(item);
					break;
				case 'C':
					System.out.println("Enter a item to remove from cart: ");
					String itemOne = scanner.next();
					removeItem(itemOne);
					break;
				case 'D':
					System.out.println("categories");
					break;
				case 'E':
					System.out.println("===========================");
					break;
				default:
					System.out.println("Invalid Option. Please Enter a valid menu option");
					break;
			}
		} while (option != 'E');
		System.out.println("List Completed: " + cart);
	}

}
