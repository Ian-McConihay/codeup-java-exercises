public class ServerNameGenerator {

	public static String returnRandom(String[] arr){
		int num = (int) (Math.random() * arr.length-1);
		return arr[num];
	}

	public static void main(String[] args) {
		String[] adjectives = {"dorable", "adventurous", "aggressive", "ashamed", "attractive", "average", "awful", "bad", "beautiful", "better"};
		String[] noun = {"man", "woman", "teacher", "John", "Mary", "home", "town", "countryside", "America", "table"};
		System.out.println("Here is your server name:");
		System.out.println(returnRandom(adjectives) + "-" + returnRandom(noun));

	}
}