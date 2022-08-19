package day19_loopPractices;

public class ExitMethod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {

            if (i==3){
            //    break; //terminates the loop
            //    continue; // terminates the correct iteration of the loop , yani 3 , sadece onu yazdirmiyor
               System.exit(0);
            }

            System.out.println(i);
        }

        System.out.println("Wooden Spoon");



    }

}
