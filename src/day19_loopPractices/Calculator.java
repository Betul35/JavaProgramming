package day19_loopPractices;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter a math operator: ");// compiler expects here to see either + or -
        char operator = scan.next().charAt(0); // char icin ozel bir scaan yok, ondan nect ve charAt i birlikte kullanmaliyiz.

        if ( !(operator=='+' || operator== '-') ){// if the operator is not valid
            System.err.println("Invalid math operator, you lost he he heee");
            System.exit(0); // to terminate here!
        }

        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();


    }
}
