import util.Input;

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

	public void sayHello() {
		System.out.println( "Hello from " + getName() + "!");
	}
	public static void main(String[] args) {
		Input in = new Input();
		System.out.println("Give me a string");
		String getString = in.getString();
		System.out.println(getString);
//		Person personOne = new Person("Ian");
//		personOne.setName("Ian");
//		personOne.sayHello();


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

