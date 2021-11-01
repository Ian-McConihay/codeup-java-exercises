public class Candy {
//	Two public fields. Taking in string literal values set to name and size
	private String name;
	private String size;

	public void setNameAndSize(String name, String size) {
		this.name = name;
		this.size = size;
	}


	public String getSize() {
		return size;
	}
	public String getName() {
		return name;
	}
//	public Candy(String name, String Size){
//
//	}


	public void sayAhhh() {
		System.out.println("Ahhhh, a " + getName() + "!" + " I see that you got the " +getSize() + " of it. Sound good!");
	}


	public static void main(String[] args) {
		Candy candyOne = new Candy();
		candyOne.setNameAndSize("Kit-Kat", "Large");
		candyOne.sayAhhh();
	}
}