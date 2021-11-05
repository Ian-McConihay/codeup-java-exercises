package shapes;

public class ShapesTest {
	public static void main(String[] args){
		Measurable myShape = new Rectangle(4,5);
//		Measurable box2 = new Square(5);
		System.out.println("Rectangle: " + myShape.getPerimeter());
		System.out.println("Rectangle: " + myShape.getArea());
		myShape = new Square(5);
		System.out.println("Square: " + myShape.getPerimeter());
		System.out.println("Square: " + myShape.getArea());
	}
}
//Q9 Because the interface calls the method but does not get the variable

//Q10