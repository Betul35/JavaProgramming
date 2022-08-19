package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice2 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //System.out.println("Enter true/false:");
       // boolean result = scan.nextBoolean();bu da boolean kullanabilmek icin.

        System.out.println("Enter your name: ");
        String name = scan.next(); // mesela Java yazdigimizi dusun, bu ok,
                                  // but if you have more than 1 word, next method only read until space, bunun icin nextLine kullanacagiz
        System.out.println("name = " + name);

        scan.close();




    }
}
