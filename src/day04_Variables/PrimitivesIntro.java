package day04_Variables;

public class PrimitivesIntro {
    public static void main(String[] args) {
       // ages: 38 years old

        byte age = 38;

        // weight : 160 pounds
        // byte weight= 160; 160 is out of byte range, it must be short

        short weight = 160;
        // 160 is within the short range

        // salary: 100000 $ 100000 is within int range
        int salary = 100_000;
        // int is the preferred datatype by integer numbers

        // number : 3_333_333_333 in within long range
        long number = 3_333_333_333L;
        /* int is more preferred, the intelliJ is forced to use int, out of int range,
         it gives error, we need to forced to take to use long, that is why L or l are needed to use */

        //tax: 0.26
        float tax = 0.26F;

        double PI = 3.14;
        // the preferred one is double

        // char is for one character
        char ch1 = '@';
        System.out.println("ch1 = " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 1345;
        System.out.println("ch3 = " + ch3);

        // boolean is used for true/ false

        boolean isEmployeed = true;
        boolean isMarried = false;
        boolean result = 100 > 300;
        System.out.println("isEmployeed = " + isEmployeed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        //String is used for more than one character like;

        String name = "Betul Piyade";
        String city = "London";
        




    }




}
