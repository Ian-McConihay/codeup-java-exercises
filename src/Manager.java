public class Manager extends Person {
	public String work() {
		return "Managing employees";
	}

	public void doWork(Employee e) {
		System.out.println(e.work());
	}

	public static void main(String[] args) {
		Employee one = new Employee();
		Employee two = new Manager();
		doWork(one);
		doWork(two);
	}
}