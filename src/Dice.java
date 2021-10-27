import java.util.Scanner;
public class Dice {
	public static void main(String[] args){
	diceRoll();
	}

	public static void diceRoll() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Would you like to D4, D6, D10, or D20?");
		String input = scanner.next();
		calculateDice(input);
	}

		public static void calculateDice(String input) {
			switch (input) {
				case "D4":
					System.out.println("You rolled: " + D4());
					break;
				case "D6":
					System.out.println("You rolled: " + D6());
					break;
				case "D10":
					System.out.println("You rolled: " + D10());
					break;
				case "D20":
					System.out.println("You rolled: " + D20());
					break;
				default:
					System.out.println(".....Pick a dice");
					break;
			}
		}

	public static int D4() {
		int min = 1;
		int max = 4;
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		return random_int;
	}
	public static int D6() {
		int min = 1;
		int max = 6;
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		return random_int;
	}

	public static int D10() {
		int min = 1;
		int max = 10;
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		return random_int;
	}

	public static int D20() {
		int min = 1;
		int max = 20;
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		return random_int;
	}





}
