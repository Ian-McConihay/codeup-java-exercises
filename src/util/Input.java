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

public int getInt(int min, int max){
	return scanner.nextInt();
}
public int getInt(){
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

public double getDouble(double min, double max){
	return scanner.nextDouble();
}
public double getDouble(){
	return scanner.nextDouble();
}






}

