package util;
import java.awt.*;
import java.lang.annotation.AnnotationFormatError;
import java.util.Scanner;
public class Input {


private Scanner scanner = new Scanner(System.in);



public String getString(){
	return scanner.nextLine();
}


public boolean yesNo(){
	String capture = scanner.nextLine();
	return capture.equalsIgnoreCase("y") || capture.equalsIgnoreCase("yes");
}
	public boolean yesNo(String prompt){
		System.out.println(prompt);
		String capture = scanner.nextLine();
		return capture.equalsIgnoreCase("y") || capture.equalsIgnoreCase("yes");
	}


//	NumberFormatException occurs when converting a string into a number. If its not a string number it will catch

//	public int getInt(){
//		return scanner.nextInt();
//	}

public int getInt(int min, int max){
	return scanner.nextInt();
}
public int getInt(String prompt){
	try{
		System.out.println(prompt);
		return Integer.parseInt(getString());
	} catch(NumberFormatException nfe) {
		System.err.println("invalid input");
		return getInt(prompt);
	}
}

	public String getBinary(String prompt){
		try{
			System.out.println(prompt);
			int input = scanner.nextInt();
			return Integer.toBinaryString(input);
		} catch(NumberFormatException nfe) {
			System.err.println("invalid input");
			return getBinary(prompt);
		}
	}

public double getDouble(){
	return this.scanner.nextDouble();
}
public double getDouble(String prompt){
	try{
		System.out.println(prompt);
		return Double.parseDouble(getString());
	} catch(NumberFormatException nfe) {
		System.err.println("invalid input");
		return getDouble(prompt);
	}
}





public double getDouble(double min, double max){
	Double userDouble;
	do{
		System.out.printf("Please enter a decimal integer between %f and %f: %n" , min, max);
		userDouble = this.scanner.nextDouble();
	} while (userDouble > max || userDouble < min);
	return userDouble;
}







}

