public class Candy {
//	Two public fields. Taking in string literal values set to name and size
	private String name;
	private String size;
	private String descriptor;
	private String[] descriptorOne;

	public void setNameAndSizeandDescriptor(String name, String size, String descriptor, String[] descriptorOne) {
		this.descriptor = descriptor;
		this.descriptorOne =descriptorOne;
		this.name = name;
		this.size = size;
	}

	public String[] getDescriptorOne() {
		return descriptorOne;
	}

	public String getSize() {
		return size;
	}
	public String getName() {
		return name;
	}
	public String getDescriptor(){
		return descriptor;
	}
//	public Candy(String name, String Size){
//
//	}


	public void sayAhhh() {
		System.out.println("I have a piece of " + getName() + " that is " +getSize() + " and could be described as " + getDescriptor());
	}


	public static void main(String[] args) {
//		String myBag[] = {"Candy coated", "Chocolate", "Sour"};
//		for(String bag : myBag)
		Candy candyOne = new Candy();
//		candyOne.setNameAndSizeandDescriptor("Kit-Kat", "Large", "chocolate");
		candyOne.sayAhhh();
	}
}