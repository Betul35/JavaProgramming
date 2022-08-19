package day12_Scanner;

import java.util.Scanner;

public class NextLineMethodPractice {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); // bu sefer scan yerine input yazdim, farketmez.

        System.out.println("Enter your age pilisss");

        int age = input.nextInt();  // iste burada bir adet enter kalacak scannerin aklinda,
                                    // akilli onu alttaki name kismina tuslucak kendi
                                    // bundan kacinmak icin bos bir nextLine yazalim ki enter orada yazilsin, salinsin
        input.nextLine(); // burada enter i release yaptik

        System.out.println("Enter your full name ciniimm");

        String fullName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("age = " + age);

        input.close();







    }
}

    /*

    ask the user enter age
    ask the user enter full name
     */
