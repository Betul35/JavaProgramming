package day15_Loops;

import java.util.Scanner;

public class Maximumnumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int max = -2147483648;// bu olabilecek en kucuk integer number

        for (int i = 0; i < 5; i++) { // 5 kere istedigimiz icin
            System.out.println("Enter a number biliiizzz");
            int num= scan.nextInt();
            if (num>max){
                max =num;
            }
        }

        System.out.println("max = " + max);





    }
}
/*
Write a program ask the users to enter a number for 5 times,
return the maximum number
 */
