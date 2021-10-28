package util;
import java.util.Scanner;
public class Input {


private Scanner scanner = new Scanner(System.in);



public String getString(){
	return scanner.nextLine();
}
public boolean yesNo(){

	case "yes":
	yn = false;
	break;
	case "no":
	yn = true;
	break;
	return scanner.hasNext();
//	return Boolean.parseBoolean(scanner.nextLine());
}
public int getInt(int min, int max){
	return scanner.nextInt();
}
public int getInt(){
	return scanner.nextInt();
}
public double getDouble(double min, double max){
	return scanner.nextDouble();
}
public double getDouble(){
	return scanner.nextDouble();
}






}

