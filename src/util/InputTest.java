package util;

import util.Input;

import java.util.Locale;

public class InputTest {
	public static void main(String[] args){
		Input in = new Input();

//		try {
//			throw new Exception("Oh sorry bud, looks like we got an Exception");
//		} catch (Exception e){
//			e.printStackTrace();
//		}
//		try{
//			System.out.println("Attempt to Divide by 0");
//			int result = 1/0;
//			System.out.println("I did it!");
//		}catch (ArithmeticException e){
//			e.printStackTrace();
//		}

		try{
		String nullStr = null;
		System.out.println(nullStr.toLowerCase());
//			throw new RuntimeException("Something went wrong!! \n (StarWars alarm)");
		} catch(NullPointerException e) {
			e.printStackTrace();
			e.getMessage();
		} catch	(RuntimeException e){
			System.out.println("Runtime Exception");
			e.printStackTrace();
			e.getMessage();
		}catch (Exception e){
			System.out.println("Generic Exception");
			e.printStackTrace();
			e.getMessage();
		} finally

	{
		System.out.println("This will Always run");
	}









//		System.out.println("Give me a string");
//		String getString = in.getString();
//		System.out.println(getString);
//
//		System.out.println("Give me true or false");
//		boolean yn = in.yesNo();
//
//		System.out.println(yn);



//		System.out.println("Give me an int");
//		int numint = in.getInt();
//		System.out.println(numint);

//		System.out.println("Give me an int");
//		int numintMinMax = in.getInt(1,4);
//		System.out.println(numintMinMax);

//		System.out.println("Give me a double");
//		double doubleMinMax = in.getDouble(1, 4);
//		System.out.println(doubleMinMax);

//		System.out.println("Give me a double");
//		double doubleNum = in.getDouble();
//		System.out.println(doubleNum);
	}
}
