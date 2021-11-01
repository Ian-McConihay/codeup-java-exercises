package movies;
import util.Input;
import java.util.Arrays;





public class MoviesApplication {
	public static void main(String[] args){
		Movie[] allMovies = findAll();
		Movie movieOne = new Movie("Ian", "White");
		movieOne.setMovie("Ian", "White");


		System.out.println(movieOne);
		System.out.println();
		System.out.println();
	}
}



//The class for moviesarray
//public class MoviesArray {
//	public static Movie[] findAll() {
//		return new Movie[]{