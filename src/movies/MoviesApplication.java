package movies;
import util.Input;
import java.util.Arrays;





public class MoviesApplication {
	public static void main(String[] args) {
		Movie[] allMovies = MoviesArray.findAll();
		boolean confirm = true;
//		Movie movieOne = new Movie("Ian", "White");
//		System.out.println(movieOne.getNameCat()):
		do {
			Input scanner = new Input();
			int answer = scanner.getInt("0 - exit" +
					"\n1 - view all movies" +
					"\n2 - view movies in the animated category" +
					"\n3 - view movies in the drama category" +
					"\n4 - view movies in the horror category" +
					"\n5 - view movies in the scifi category" +
					"\n\n Please select a number option:");
			switch (answer) {
				case 1:
					for (Movie movie : allMovies) {
						System.out.println("Title: " + movie.getName() + " Category: " + movie.getCategory());
					}
					break;
				case 2:
					for (Movie movie : allMovies) {
						if (movie.getCategory().equalsIgnoreCase("animated")) {
							System.out.println("Title: " + movie.getName() + " Category: " + movie.getCategory());
						}
					}
					break;
				case 3:
					for (Movie movie : allMovies) {
						if (movie.getCategory().equalsIgnoreCase("drama")) {
							System.out.println("Title: " + movie.getName() + " Category: " + movie.getCategory());
						}
					}
					break;
				case 4:
					System.out.println("Category: Horror");
					for (Movie movie : allMovies) {
						if (movie.getCategory().equalsIgnoreCase("horror")) {
							System.out.println("Title: " + movie.getName());
						}
					}
					break;
				case 5:
					for (Movie movie : allMovies) {
						if (movie.getCategory().equalsIgnoreCase("scifi")) {
							System.out.println("Title: " + movie.getName() + " Category: " + movie.getCategory());
						}
					}
				default:
					break;
			}
			confirm = new Input().yesNo("Return to main menu? [y/N]");
		} while(confirm);
	}
}




