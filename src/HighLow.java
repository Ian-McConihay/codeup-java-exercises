import java.util.Scanner;
public class HighLow {
	public static void main (String[] args){
		pickNumber();
	}

	public static void pickNumber() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick a number between 1-100");
		int userNum = scanner.nextInt();
		botHighLow(userNum);
	}

	public static void botHighLow(int userNum){
		if(userNum > random()){
			System.out.println("LOWER!! Thats not my number");
		} else if(userNum < random()) {
			System.out.println("HIGHER!! Thats not my number");
		} else if(userNum == random()) {
			System.out.println("WOW, YOU GOT IT!!");
		} else{
			System.out.print("Oh come on! Keep guessing");
		}
	}

	public static int random() {
		int min = 2;
		int max = 50;
		int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
		return random_int;
	}





}
