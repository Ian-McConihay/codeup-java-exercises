package shapes;

public class Square extends Rectangle {
	private int side;
	public Square(int side) {
		super(side, side);
		this.side = side;
	}




//	Setters are for the object
	public void setSide(){
		this.side = side;
	}


//	getters are for the terminal call
	public int getSide() {
		return side;
	}
	public int getAreaSquare(){
		return getSide() * getSide();
	}
	public int getPerimeterSquare(){
		return getSide() * 4;
	}
}
