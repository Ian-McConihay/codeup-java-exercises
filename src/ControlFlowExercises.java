import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {
        System.out.println("I am Here!");
//    do not use == signs with stings in java
//        boolean isSunny = false;
//        boolean hasUmbrella = false;
//        if(isSunny){
//            System.out.println("Cool man you are ready! Grab the Umbrella");
//        }
//        else if (!isSunny && hasUmbrella){
//            System.out.println("Cool" );
//        }
//        else {
//            System.out.println("Go check the weather");
//        }
//
//        int bee = 1;
//        switch(bee){
//
//        }
//
//        char userInput = 'n';
//        do{
//            System.out.println("du hast");
//        } while (userInput == 'y');
//    while(userInput == 'y')


//
//                int i = 5;
//        while(i <= 15) {
//            System.out.println("i is " + i);
//            i++;
//        }

//        tristan
//        int i = 5;
//        while(i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }
//for (long i = 2; i <= 1_000_000; i *= i){
//    System.out.println(i);
//}


//        int i = 0;
//        do {
//            System.out.println(i * 2);
//            i++;
//        } while(i <= 100);
//
//      tristan
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        } while(i <= 1_000_000);



//        for (int i = 1; i < 50; i++) {
//            if (i % 15 == 0) {
//                System.out.println("FizzBuzz");
//            } else if (i % 3 == 0){
//                System.out.println("Fizz");
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//            } else  System.out.println(i);
//        }
    Scanner scanner = new Scanner(System.in);
//
//tristan
//
        boolean confirm;
//        do {
//            System.out.print("Enter a Number: ");
//            int userNum = scanner.nextInt();
//            System.out.println("Number | squared | cubed");
//            System.out.println("-------|---------|------");
//            for (int i = 1; i <= userNum; i++) {
//                System.out.printf("%-7d|%-9d|%-6d\n", i, i * i, i * i * i);
//            }
//          System.out.println("Do you want to continue? (Y/N)");
//          confirm = scanner.next().equalsIgnoreCase("y");
//        } while(confirm);




//        System.out.println("Do you want to play a game?");
//        boolean yes = false;
//        boolean no = false;
//        if(yes){
//            System.out.println("enter an integer");
//        }
//        else if (no){
//            System.out.println("Go check the weather");
//        }
//        String play = scanner.next();
//
//        System.out.printf("Y/N");
    do {
        System.out.print("Enter a numerical grade: ");
        int grade = scanner.nextInt();
        if (grade >= 90) {
            System.out.println("Your grade is an A!");
        } else if (grade >= 80) {
            System.out.println("Your grade is an B!");
        } else if (grade >= 70) {
            System.out.println("Your grade is an C!");
        } else if (grade >= 60) {
            System.out.println("Your grade is an D!");
        } else {
            System.out.println("Your grade is FAIL");
        }
        System.out.println("Do you want to enter another grade? (Y/N)");
          confirm = scanner.next().equalsIgnoreCase("y");
        } while(confirm);













    }
}