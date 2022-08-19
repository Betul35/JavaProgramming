package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your full name : ");// full name diyor, o zaman nextLine methodu kullanacaz
        String fullName = scan.nextLine();

        System.out.println("Enter your Programming Language :");
        String programming = scan.nextLine();

        System.out.println("Enter your age :");
        int age = scan.nextInt(); // burada 24Enter tusluyoruz, compiler 24 okuyor, sonra enter scanners memory de kaliyor
        
        scan.nextLine(); // iste burada yukaridan kalan, int in okumadigi enter yazilmis oluyor.

        System.out.println("Enter your school name :");
        String schoolName = scan.nextLine(); // iste burada kalan enter yazilmis oluyor, 
                                            // bundan dolayi altta tuslayip yazmamiza izin vermiyor, 
                                            // bunun icin hemen bunun oncesine bir nextLkine ekleyip enteri release yapmasini sagliyoruz.

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        scan.close();


    }
}
