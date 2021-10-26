import java.util.Scanner;
public class Bob {
	public static void main(String[] args){


		Scanner scanner = new Scanner(System.in);
		boolean confirm;

		do {
			System.out.print("Hey.... Names bob... ");
			String response = scanner.nextLine();
			if (response.endsWith("!")) {
				System.out.println("Whoa, chill out!");
			} else if (response.endsWith("?")) {
				System.out.println("Sure");
			} else if (response.endsWith("z")) {
				System.out.println("Whatever");
			} else {
				System.out.println("Fine. Be that way!");
			}

			System.out.println("Do you want to keep talking? (Y/N)");
			String stringres = scanner.next();
			confirm = stringres.equalsIgnoreCase("y");
		} while(confirm);








	}
}
