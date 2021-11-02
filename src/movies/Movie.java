package movies;

	public class Movie {
	private String name;
	private String category;

//		Constructor this is creating the obj.
//		Constructor should be the same name as the class
//		Constructors are default void so you dont need to list it as void
	public Movie(String name, String category){
		this.name = name;
		this.category = category;
	}

	public String getNameCat(){
		return "Name of Movie: " + getName() + "\nMovie Category: " + getCategory();
	}


	public String getName(){
		return name;
	}
	public String getCategory(){
		return category;
	}

	public void setName(String name){
		this.name = name;
	}
	public void setCategory(String category){
		this.category = category;
	}

}
