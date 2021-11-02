package shapes;

import java.security.PublicKey;

public class Rectangle {
	protected int length;
	protected int width;

//	Constructor
	public Rectangle(int width, int length){
		this.length = length;
		this.width = width;
	}

//	Setters
	public void setLength(int length){
		this.length = length;
	}
	public void setWidth(int width) {
		this.width = width;
	}

//	Getters
	public int getLength(){
		return length;
	}

	public int getWidth() {
		return width;
	}

	public String getPerimeter(){
		return "Perimeter = " + getLength() * 2 + getWidth() * 2;
	}
	public String getArea(){
		return "Area = " + getLength() * getWidth();
	}
}
