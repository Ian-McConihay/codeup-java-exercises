package shapes;

public class Square extends Quadrilateral  {

	protected Square(double side) {
		super(side, side);
	}

	@Override
	public void setWidth(double side) {
	this.width = side;
	}

	@Override
	public void setLength(double side) {
		this.length = side;
	}

	@Override
	public double getPerimeter() {
		return this.length * 4;
	}

	@Override
	public double getArea() {
		return this.length * this.width;
	}
}
