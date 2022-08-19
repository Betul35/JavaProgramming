package day09_IfElseStatement;

public class MinNumber_warpUp {


    public static void main(String[] args) {

        int num1 = 100;
        int num2 = 200;

        boolean pos1 = num1 < num2;
        boolean pos2 = num2 < num1;
        boolean pos3 = num1 == num2;


        if (pos1) {
            System.out.println(num1 + " is min number");

        }

        if (pos2) {

            System.out.println(num2 + " is min number");

        }

        if (pos3) {
            System.out.println("They are equal");
        }
    }
}

/*
        num1= 100, num2= 200
        find minimum one, 3 possibilities
        1: n1 is minimum
        2: n2 is minimum
        3: they are equal

 */
