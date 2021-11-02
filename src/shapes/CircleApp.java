package shapes;
import util.Input;
public class CircleApp {
	public static void main(String[] args){

		Input input=new Input();
		System.out.println("Give an integer for the cycles radius.");
		double radius = input.getDouble();
		Circle circle = new Circle(radius);
		double circumference = circle.getCircumference();
		double area =
	}
}
