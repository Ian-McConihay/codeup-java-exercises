public class ControlFlowExercises {
    public static void main(String[] args) {
    System.out.println("I am Here!");
//    do not use == signs with stings in java
        boolean isSunny = false;
        boolean hasUmbrella = false;
        if(isSunny){
            System.out.println("Cool man you are ready! Grab the Umbrella");
        }
        else if (!isSunny && hasUmbrella){
            System.out.println("Cool" );
        }
        else {
            System.out.println("Go check the weather");
        }

        int bee = 1;
        switch(bee){

        }

        char userInput = 'n';



                int i = 5;
        while(i <= 15) {
            System.out.println("i is " + i);
            i++;
        }

//        int i = 0;
//        do {
//            System.out.println(i * 2);
//            i++;
//        } while(i <= 100);




    }
}
