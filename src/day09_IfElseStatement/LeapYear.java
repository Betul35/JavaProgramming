package day09_IfElseStatement;

public class LeapYear {

    public static void main(String[] args) {

        int year = 2000;

        boolean leapYear = year % 4 == 0;

        if (leapYear) {
            System.out.println("Year " + year + " is a leap year");
        }

        if (!leapYear) {
            System.out.println("Year " + year + " is NOT a leap year");
        }

        System.out.println("----------------------------------------------the best way is");

        // bu yolla 2 if yazmamis oluyoruz, compiler 2 kere check etmemis oluyor.

        if(leapYear){
            System.out.println("Year " + year + " is a leap year");
        }else{ // else means here, otherwise, opposite of if
            System.out.println("Year " + year + " is NOT a leap year");
        }
    }
}
