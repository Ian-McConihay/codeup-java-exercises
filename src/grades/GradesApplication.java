package grades;
import util.Input;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class GradesApplication {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		HashMap<String , Student> usernames = new HashMap<>();

		Student ian = new Student("Ian", new ArrayList<>());
		Student kyle = new Student("Kyle", new ArrayList<>());
		Student duck = new Student("Duck", new ArrayList<>());
		Student clark = new Student("Clark", new ArrayList<>());

		usernames.put("AllMight", ian);
		usernames.put("Monster", kyle);
		usernames.put("Cody", duck);
		usernames.put("Superman", clark);

		ian.addGrade(70);
		ian.addGrade(88);
		ian.addGrade(90);
		ian.addGrade(82);

		kyle.addGrade(50);
		kyle.addGrade(70);
		kyle.addGrade(75);
		kyle.addGrade(80);

		duck.addGrade(100);
		duck.addGrade(98);
		duck.addGrade(95);
		duck.addGrade(92);

		clark.addGrade(80);
		clark.addGrade(85);
		clark.addGrade(90);
		clark.addGrade(95);

		boolean confirm = true;

		do{
		System.out.println("Enter a username: " + "\n|AllMight| |Monster| |Cody| |Superman|");
		String input = scanner.next();
		switch (input) {
			case "AllMight":
				System.out.println("Student Name: " + ian.getName() + "\nAverage Grade: " + ian.getGradeAverage() );
				break;
			case "Monster":
				System.out.println("Student Name: " + kyle.getName() + "\nAverage Grade: " + kyle.getGradeAverage());
				break;
			case "Cody":
				System.out.println("Student Name: " + duck.getName() + "\nAverage Grade: " + duck.getGradeAverage());
				break;
			case "Superman":
				System.out.println("Student Name: " + clark.getName() + "\nAverage Grade: " + clark.getGradeAverage());
				break;
			default:
				System.out.println("Invalid Option. Please Enter a valid Username");
				break;

		}
			confirm = new Input().yesNo("Return to main menu? [y/N]");
	} while (confirm);
		System.out.println("Have a nice day");



	}
}