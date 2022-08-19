package day13_String;

import java.util.Scanner;

public class Initials_CharAt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name piliss");
        String firstName = scan.next();

        System.out.println("Enter your last name canisi");
        String lastName = scan.next();


        char f = firstName.charAt(0);// burada compilar a diyorum ki isminin ilk characterini kodla, yani index 0
        char l = lastName.charAt(0); // simdi bunu ilk BP gibikodlayalim, yani isimilkharf ve soyisim ilk harf gibi

        // String initial = f + l; boyle kodlarsak ilk bize compiler error veriyor cunku bu sadece concatination, icinde string yok
        // buna string ekleyip kodlayabiliriz ki soyle;
        // String initial = " " + f + l;
        String initial = " " + f + l;
        // ama zaten ortaya . koyarsak yani B.P gibi o zaman bosluk String koymaya gerenk yok, "." yazmak durumunda oldugun=muz icin.


        System.out.println("initial = " + initial);

        scan.close();


    }
}
