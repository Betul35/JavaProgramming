package day08_IfStatement;

public class SingleIfStatementsIntro {

    public static void main(String[] args) {

        int number = 300;

       /* System.out.println("Odd Number");
        System.out.println("Even number");

        */

        boolean evenNumber = number % 2 == 0;

        if (evenNumber) { //even number
            System.out.println(number + " is even number");
        }
        if (!evenNumber) { // not even number (it doesn't run false statement, yani not even number olan)
            System.out.println("!evenNumber = " + evenNumber);

        }
            System.out.println("---------------------------------");

            int n = 200;

            // positive
            if(n>0){ // diyor ki eger n buyukse ziro dan n is positive
                System.out.println(n+ " is positive");
            }

            //negative
            if(n<0){ // diyor ki eger n <0 ise n is negative
                System.out.println(n+ " is negative");
            }

            //zero
            if(n==0){ // diyor ki eger n=0 ise n zerodur
                System.out.println(n + " is zero");

            }





    }
}
