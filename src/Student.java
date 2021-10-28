import java.util.Scanner;

public class Student {
		public String name;
		public String cohort;

//		Constructors are METHODS BUT USING OBJECTS

//Constructor 1
		public Student(String name) {
			this(name, "Unknown");
		}
//Constructor 2
		public Student(String studentName, String assignedCohort) {
			this.name = studentName;
			this.cohort = assignedCohort;
		}
//	anyoneCanUse constructor-method(String studentName, String assignedCohort) {
//			field = parameter;
//	}
		public String getInfo() {
			return String.format("name: %s, cohort: %s", name, cohort);
		}

		public static void main(String[] args) {
			Student s1 = new Student("Student A");
			Student s2 = new Student("Student B", "Voyagers");
			System.out.println(s1.getInfo()); // "name: Student A cohort: Unassigned"
			System.out.println(s2.getInfo()); // "name: Student B cohort: Voyagers"
//			Student ian = new Student("Ian", "Star Fleet");
//			System.out.printf("%s is assigned to %s" + ian.name, ian.cohort);
		}





//import java.util.Scanner;
//	private static class Person {
//		public static long worldPopulation = 7_500_000_000L;
//		public String firstName;
//		public String lastName;
//		public String weapon;
//		public String sayHello() {
//			return String.format("Hello from %s %s!", firstName, lastName);
//		}
//		//Object of NPC's
////	This section is called instance method
//		public static void rick() {
//			Scanner scanner = new Scanner(System.in);
//			Person rick = new Person();
//			rick.firstName = "Rick";
//			rick.lastName = "Sanchez";
//			rick.weapon = "Intellect";
//			System.out.println(rick.firstName);
//
//			String o = scanner.next();
//
//		}
//		public static void pop (){
//			Person ian = new Person();
//			ian.firstName = "Ian";
//
//			Person.worldPopulation += 1; // accessing a static property
//
//			System.out.println(Person.worldPopulation); // 7500000001
//
//			// technically this will work, but it is usually better to reference
//			// static properties through the class, not instances
//			System.out.println(ian.worldPopulation); // 7500000001
//
//			// DONT DO THIS, it will not compile
////		System.out.println(Person.name);
//		}
	}

