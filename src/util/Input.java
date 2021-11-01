package util;
import java.util.Scanner;
public class Input {


private Scanner scanner = new Scanner(System.in);



public String getString(){
	return scanner.nextLine();
}
public boolean yesNo(){

	if (scanner.hasNext("y")) {
		return true;
	} else if (scanner.hasNext("yes")) {
		return true;
	} else if (scanner.hasNext("Y")) {
		return true;
	} else if (scanner.nextLine().equalsIgnoreCase("yes")) {
		return true;
	}
	return false;
//	case "yes":
//	yn = false;
//	break;
//	case "no":
//	yn = true;
//	break;
//	return scanner.hasNext();
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

