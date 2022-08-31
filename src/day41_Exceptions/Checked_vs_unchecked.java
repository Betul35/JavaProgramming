package day41_Exceptions;

import day36_Inheritance.encapsulation.Student;

public class Checked_vs_unchecked {

    public static void main(String[] args) {

        int a = 10;
        int b = 0;
        // System.out.println( a/b ); 0 ile bolunmeyecegi icin bu unchecked exception, cunku run yapmadan compiler error vermiyor, run ladiktan sonra veriyor
        // sonrasinda yazilan code u da yazdirmaz, cunku terminate the programme

        Student student = null;
       // System.out.println( student.getName() ); bos oldugu icin bunu run ladigimiz zaman error verecek



    }


}
