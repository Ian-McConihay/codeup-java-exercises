import java.util.Arrays;
public class ArraysExercises {



	public static void main(String[] args){
//		Number Arrays
		double[] prices = new double[4];

		final int numberOfSides = 6;
		int[] diceSides = new int[numberOfSides];

		System.out.println("prices.length = " + prices.length);
		System.out.println("diceSides.length = "+ diceSides.length);
		System.out.println("diceSides[0] = " + diceSides[0]);

//		String arrays
		String[] myBag = {"Gun", "Sword", "Shield", "Battle Ax"};
		System.out.println(myBag[2]);
//		iterating through the arrays
//		for(int i = 0; i < myBag.length; i++){
//			System.out.println(myBag[i]);
//		}
//		Alternate for the for loop
//		for(String weapon : myBag){
//			System.out.println(weapon);
//		}
//		Empty array
		String[] backpack = new String[12];
		System.out.println(backpack);


//		Arrays.fill was for a single value
		Arrays.fill(backpack, "med-kit");
		System.out.println(backpack);
		for(String pack : backpack){
			System.out.println(pack);
		}
//Searching in an array


//		Two-dimensional Arrays
		int[][] matrix = {
				{1, 2, 3}, //arr 1
				{4, 5, 6}, //arr2
				{7, 8, 9} //arr3 these are the ELEMENTS of the outer array
		};
		for(int[] row : matrix){
			System.out.println("+---+---+---+");
			System.out.println("| ");
			for (int n : row) {
				System.out.print(n + " | ");
			}
			System.out.println();
		}


//		Exercise
		int[] numbers = {1, 2, 3, 4, 5};
		System.out.println(numbers);



	}










}
