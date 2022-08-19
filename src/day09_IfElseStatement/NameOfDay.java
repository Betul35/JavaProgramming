package day09_IfElseStatement;

public class NameOfDay {


    public static void main(String[] args) {
        int n = 7; // 1~7

        if (n == 1) {
            System.out.println("today is Monday");
        } else if (n == 2) {
            System.out.println("today is Tuesday");
        } else if (n == 3) {
            System.out.println("today is Wednesday");
        } else if (n == 4) {
            System.out.println("today is Thursday");
        } else if (n == 5) {
            System.out.println("today is Friday");
        } else if (n == 6) {
            System.out.println("today is Saturday");
        } else {
            System.out.println("today is Sunday");
        }

        System.out.println("-------------------------there is a better way, asagida.....");


        int n2 = 4;
        String day ="today";


        if (n2 == 1) {
            day = "monday";
        }
        if (n2 == 2) {
            day = "tuesday";
        }
        if (n2 == 3) {
            day = "Wednesday";
        }
        if (n2== 4) {
            day = "Thursday";
        }
        if (n2 == 5) {
            day = "Friday";
        }
        if (n2 == 6) {
            day = "Saturday";
        }
        if (n2 == 7) {
            day = "Sunday";
        }

        System.out.println("day = " + day);
    }
}
