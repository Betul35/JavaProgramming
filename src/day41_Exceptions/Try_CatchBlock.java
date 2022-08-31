package day41_Exceptions;

public class Try_CatchBlock {

    public static void main(String[] args) {

        System.out.println("Test Started");

        try {
            System.out.println(9/0);
            System.out.println("Try Block");
        }catch (ArithmeticException e){
            System.out.println("Catch Block");
            System.out.println("Arithmetic Exception was occurred");
        }

        System.out.println("Test Completed");

        System.out.println("-------------------------------------------------");

        System.out.println("Test2 started");

        int[] numbers = {1,2,3,4,5};

        try {

            System.out.println(numbers[200]); //bunu run larsak error verecek
            System.out.println("Try Block");
        }catch (RuntimeException e){

           /* System.out.println("Catch Block");
            System.out.println("RuntimeException was occurred"); bunun yerine sunu da yazabiliriz */

           // e.printStackTrace(); // bu bize tum detaili verecek, cok useful bir method, en tercih edilen bu
            //ya da  tercih edileni getMessage()

            System.out.println( e.getMessage() ); //automation da cok kullanacagiz
        }

        System.out.println("Test2 Competed");

    }


}
