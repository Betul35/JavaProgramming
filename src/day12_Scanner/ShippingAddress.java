package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your building number");
        int buildingNumber = input.nextInt();

        input.nextLine();

        System.out.println("Enter your street name");
        String streetName = input.nextLine();

        System.out.println("Enter your city name");
        String cityName = input.nextLine();

        System.out.println("Enter your state");
        String state = input.next();

        input.nextLine();

        System.out.println("Enter your zip code");
        String zipCode = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);


        System.out.println(fullName + "\n" + buildingNumber + "\n" + streetName + "\n" +
                cityName + "\n" + state + "\n" + zipCode );
        input.close();







    }
}
    /*
        Enter your full name
        enter your building number
        provide your street name
        city name
        state (VA)
        enter your zip code

        display the shipping address
    */
