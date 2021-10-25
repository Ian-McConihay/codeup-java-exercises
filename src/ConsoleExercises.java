import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        System.out.println("I am Here!");
        String batman = "Batman";
        String name = "Bane";
//        System.out.printf("%s. I was born in the dark %s. \n" , name, batman);

        String left = "Left";
//        left = true;

        Scanner scanner = new Scanner(System.in);

//        System.out.print("Enter something: ");
//        String userInput = scanner.next(); only one word

//        .next will probably be better

//        nextInt for numbers

//        String userInput = scanner.nextLine();
//        System.out.println("You entered: --> \"" + userInput + "\" <--");
//        if(userInput = "left"){
//            return
//        };


//        double pi = int newPi;
        double pi = 3.14159;
// \n is the same as %n
//        System.out.printf("The value of pi is approximately: ");
//        System.out.printf("%.2f.", pi);
//#1
//        System.out.println("Give me a number");
//        Integer userInputInt = scanner.nextInt();
//        System.out.println("You entered " + userInputInt + "\n");


//2#
                System.out.println("I need 3 words");
                String userwords1 = scanner.next();
                String userwords2 = scanner.next();
                String userwords3 = scanner.next();
                System.out.printf("Thanks you for your 3 words: " + userwords1 + userwords2 + userwords3);

//                System.out.println("Tell me why you love video games?");
//                String games = scanner.nextLine();
//                System.out.println(games + " too!!");

//                System.out.println("Now tell me the width and length of the classroom");
//                int width = scanner.nextInt();
//                int length = scanner.nextInt();
////                int width = Interger.parseInt(width);
////                int length = Interger.parseInt(length);
//                System.out.println("Oh so the area is? " + width * length);
//                System.out.println("And the perimeter is! " + width*4 );
    }
}