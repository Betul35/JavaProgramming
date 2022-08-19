package day11_Switch_Scanner;

import java.security.cert.CertificateRevokedException;

public class Calculator {

    public static void main(String[] args) {

    int n1 = 23;
    int n2 = 78;
    char operator = '+';
    boolean valid = operator == '+' || operator=='-' || operator == '*' || operator == '/';

    if (valid){

        switch (operator){
            case '+':
                System.out.println(n1+n2);
                break;

            case '-':
                System.out.println(n1-n2);
                break;

            case '*':
                System.out.println(n1*n2);
                break;

            default:
                System.out.println(n1/n2);
        }


    }else { // yani +-/* degilse mesela @ olursa invalid olacak diye bunu koyduk, nested
        System.err.println("Invalid Operator: " +operator); // to print error messages, we use err.println kisayol serr
    }





    }
}
/*
Given two variables n1, n2 a char variable named operator.
use switch statement to calculate the result of n1 n2 based on the given operator
valid operators are: -,+,*,/
 */
