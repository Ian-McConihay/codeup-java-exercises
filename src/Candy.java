public class Candy {
	private String name;
	private String size;

	public String getSize() {
		return size;
	}

	public String getName() {
		return name;
	}

	public void setNameAndSize(String name, String size) {
		this.name = name;
		this.size = size;
	}

	public void sayAhhh() {
		System.out.println("Ahhhh, a " + getName() + "!" + " I see that you got the " +getSize() + " of it. Sound good!");
	}


	public static void main(String[] args) {
		Candy candyOne = new Candy();
		candyOne.setNameAndSize("Kit-Kat", "Large");
		candyOne.sayAhhh();
	}
}