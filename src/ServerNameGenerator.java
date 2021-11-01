import java.util.Arrays;
import java.util.Scanner;

public class ServerNameGenerator {


	public static void main(String[] args) {
		String[] adjectives = {"dorable", "adventurous", "aggressive", "ashamed", "attractive", "average", "awful", "bad", "beautiful", "better"};
		String[] noun = {"man", "woman", "teacher", "John", "Mary", "home", "town", "countryside", "America", "table"};

		public static void diceRoll() {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Create your random server name, type Random");
			String input = scanner.next();
			serverName(input);

		}
		public static String[] random(){
			switch (serverName) {
				case "Random":
					System.out.println("You adjective: " + RandomServer());
					break;
					default:
					System.out.println("Error in input");
					break;
			}
		}
		public static int RandomServer() {
			int min = 1;
			int max = 4;
			int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
			return random_int;
		}

	}
}