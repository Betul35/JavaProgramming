package day12_Scanner;

import java.util.Scanner;

public class CircleScanner {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the radius of the circle: ");

        double r = scan.nextDouble(); // burasi last time to use scanner, onun icin burdan sonra close yapabiliriz.
                                        // eger not sure sonunda kapat
        scan.close();

        double area = r * r * 3.14;
        double perimeter = 2 * r * 3.14;

        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);




    }
}
    /*
        circle:
        ask the user to enter the radius of the circle
        ask the users to calculate the area and perimeter of the circle by using the radius
    */
