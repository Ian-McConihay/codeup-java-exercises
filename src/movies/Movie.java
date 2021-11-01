package movies;

public class Movie {
private String name;
private String category;


	public Movie(String name, String category) {
	}

	public void setMovie(String name, String category){
		this.name = name;
		this.category = category;
	}

	public String getMovie(){
		return name;
	}
	public String getCategory(){
		return category;
	}


}
