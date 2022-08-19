package day15_Loops;

import java.util.Scanner;

public class FormatFullName {

    public static void main(String[] args) {

    /* String firstName = "cyDEo";
    String lastName = "SCHOOL"; */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first name and last name");

        String firstName = scan.next();
        String lastName = scan.next();

    firstName =firstName.substring(0,1).toUpperCase() + firstName.substring(1).toLowerCase();
                            // C                      +         ydeo
                // veya su ilk yeri C yi soyle yazabilirsin:
            // ("" + firstName.charAt(0)).toUpperCase() + .............. ==> burada parantezin icini String yapmaya calisiyoruz

        System.out.println("firstName = " + firstName);

        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println("lastName = " + lastName);
        System.out.println(firstName + " " + lastName);



    }
}
/*
3. Write a program that asks user to enter first and last names, and then prints the full name in regular format (first character in upper case)

                    input:
                        firstName = "cyDEo"
                        lastName = "SCHOOL";

                    output:
                        Cydeo School


 */
