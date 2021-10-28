public class Person {
	private String name;

	public Person(String name) {
	}

	public String getName(){
		return name;
	}

	public void setName(String name){
	this.name = name;
	}

	public String sayHello() {
		return "Hello from " + getName() + "!";
	}
	public static void main(String[] args) {

		Person personOne = new Person("Ian");
		personOne.setName("Ian");
		System.out.println(personOne.sayHello());


//		Person person1 = new Person("John");
//		Person person2 = new Person("John");
//		System.out.println(person1.getName().equals(person2.getName()));
//		System.out.println(person1 == person2);
////	null

//		Person person1 = new Person("John");
//		Person person2 = person1;
//		System.out.println(person1 == person2);
////	True


//		Person person1 = new Person("John");
//		Person person2 = person1;
//		System.out.println(person1.getName());
////		null
//		System.out.println(person2.getName());
////		null
//		person2.setName("Jane");
//		System.out.println(person1.getName());
////		Jane
//		System.out.println(person2.getName());
////		Jane


	}









}

