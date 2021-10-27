import java.util.Scanner;
public class Dice {
	public static void main(String[] args){


		public static void diceRoll() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Would you like to add, subtract, multiply, or divide?");
			String input = scanner.next();
			System.out.println("Input two numbers e.g. x x ");
			float num1 = scanner.nextFloat();
			float num2 = scanner.nextFloat();
			calculateDice(num1, num2, input);


			int min = 50;
			int max = 100;
			//Generate random int value from 50 to 100
			System.out.println("Random value in int from "+min+" to "+max+ ":");
			int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
			System.out.println(random_int);
		}
	}



		public static void calculateDice(float num1, float num2, String input) {
			switch (input) {
				case "D4":
					System.out.println("Sum: " + add(num1, num2));
					break;
				case "D6":
					System.out.println("Difference: " + subtract(num1, num2));
					break;
				case "D10":
					System.out.println("Product: " + multiply(num1, num2));
					break;
				case "D20":
					System.out.println("Dividend: " + divide(num1, num2));
					break;
				default:
					System.out.println("idk how we got here, fam");
					break;
			}
		}

//        "Sum: " + add(num1, num2)


		public static float add(float num1, float num2) {
			return num1 + num2;
		}

		public static float subtract(float num1, float num2) {
			return num1 - num2;
		}

		public static float multiply(float num1, float num2) {
			return num1 * num2;
		}

		public static float divide(float num1, float num2) {
			return num1 / num2;
		}







}
