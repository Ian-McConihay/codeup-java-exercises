package util;

import util.Input;

public class InputTest {
	public static void main(String[] args){
		Input in = new Input();

		System.out.println("Give me a string");
		String getString = in.getString();
		System.out.println(getString);

		System.out.println("Give me true or false");
		boolean yn = in.yesNo();

		System.out.println(yn);



		System.out.println("Give me an int");
		int numint = in.getInt();
		System.out.println(numint);

		System.out.println("Give me an int");
		int numintMinMax = in.getInt(1,4);
		System.out.println(numintMinMax);

//		System.out.println("Give me a double");
//		double doubleMinMax = in.getDouble(1, 4);
//		System.out.println(doubleMinMax);

		System.out.println("Give me a double");
		double doubleNum = in.getDouble();
		System.out.println(doubleNum);
	}
}
