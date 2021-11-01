import java.util.Arrays;

public class ArraysExercises {

	public static Person[] addPerson(Person[] Person, Person name) {
		Person[] newPerson = Arrays.copyOf(Person, Person.length + 1);
		newPerson[newPerson.length - 1] = name;
		return newPerson;

	}


	public static void main(String[] args){
		Person[] Person = new Person[4];
		Person[0] = new Person("Jackie");
		Person[1] = new Person("Ian");
		Person[2] = new Person("Adamina");

//		System.out.println(Person);

//		Person = addPerson(Person, "ian" );
		for(Person name : Person) {
			System.out.println(name);
		}



		Person newPerson = new Person("Nick");
		for(Person name : Person){
			System.out.println(name);
			Person = addPerson( Person, newPerson);
		}









	}
}
