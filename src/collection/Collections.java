package collection;

import java.util.ArrayList;
import java.util.HashMap;

public class Collections {
	public static void main(String[] args) {
//		String[] nameOfVar = {"thing1", "thing2", "thing3"};
//		System.out.print(nameOfVar[3]);

		ArrayList<String> students = new ArrayList<>();
		students.add("thing1");
		students.add("thing2");
		System.out.println(students);
		System.out.println(students.size());


		ArrayList<Integer> grade = new ArrayList<>();
		grade.add(2);
		grade.add(3);
		grade.add(0, 18);
		grade.add(3,12);
		grade.add(grade.size() + 50);
//		printing the obj also includes the bracket []
		System.out.println(grade);
//		.size prints the .length
		System.out.println(grade.size());
//		.get finds the index
		System.out.println(grade.get(3));
//		.contains is .includes
		System.out.println(grade.contains(2));
//		.isEmpty checks if the array is empty
		System.out.println(grade.isEmpty());
//		remove by index
		System.out.println(grade.remove(1));
//		remove by object, name
		System.out.println(grade.remove((Integer) 54));


		System.out.println(grade);


//		Hash Maps

		System.out.println("\n \n \n <--Hash Maps-->");

		HashMap<String, String> usernames = new HashMap<>();
//		key , value
		usernames.put("Ian", "AllMight");
		usernames.put("Kyle", "Monster");
		usernames.put("Duck", "Cody");

//		giving a key and receiving the value
		System.out.println("Kyles username is: " + usernames.get("Kyle"));

//		if the keys value does not exist then it will give a default
		System.out.println(usernames.getOrDefault("brian", "unknown"));

//		containsKey finds values with the attached key and returns a boolean
		System.out.println("Monster");



		usernames.putIfAbsent("Duck", "Notthehuman");
		usernames.putIfAbsent("David", "Goliath");
		System.out.println(usernames);

		System.out.println(usernames.replace("Duck", "Cody", "TheCody"));
		System.out.println(usernames);
	}
}
