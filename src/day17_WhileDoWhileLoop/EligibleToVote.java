package day17_WhileDoWhileLoop;

import java.util.Scanner;

public class EligibleToVote {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt(); // valid age: 1~120


        while (age<=1 || age>=120){ // while the age is invalid
            System.err.println("Invalid enter, please re-enter");
            age = scan.nextInt();
        }
        System.out.println("Are you a US citizen? yes/no");
        String beingCitizen = scan.next();
        while (!(beingCitizen.equalsIgnoreCase("Yes" ) || beingCitizen.equalsIgnoreCase("No"))){
            System.out.println("Invalid enter, please enter Yes or No");
            beingCitizen = scan.next();
        }

        if (age>=18 && beingCitizen.equalsIgnoreCase("yes")){
            System.out.println("You are eligible for vote");
        }else {
            System.out.println("You are not eligible for vote ciniimm");
        }



    }
}
