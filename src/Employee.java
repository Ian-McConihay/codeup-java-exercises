public class Employee extends Person {

	public Employee(String employeeName){
		super(employeeName);
	}
	public void sayHello(){
		System.out.println("Welcome to the game.");
	}
	public void doWork(){
		System.out.println("Sweat baby sweat...");
	}

	public int getAge(){
		return this.age;
	}

	public static void main(String[] args){
		Person ian = new Employee("Ian");
		Employee mrIan = new Employee("Mr Ian");
		ian.setName("Ian");
		ian.sayHello();
		mrIan.doWork();
	}


}
















//	Inheritance
//	extend or inherit from another class
//	subclass inherit from a superclass
//	extends keyword is for the subclass to use the superclass methods
//	private strict tp the class protected is for sub and super classes
//	Polymorphism
//