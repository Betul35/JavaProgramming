package day09_IfElseStatement;

public class medianNumber {

    public static void main(String[] args) {

        int a = 10,
                b = 15,
                c = 20;

        boolean pos1 = (a > b && a < c) || (a > c && a < b),
                pos2 = (b > a && b < c) || (b < a && b > c),
                pos3 = (c > a && c < b) || (c > b && c < a); // or !pos1 && !pos2;  diye de yazabiliriz.

        if (pos1) {

            System.out.println(a +" is medium number");
        }

        if (pos2) {

            System.out.println(b+ " is medium number");
        }

        if (pos3) {
            System.out.println(c + " is medium number");
        }
    }
}
/*
        a=10, b=15, c=20  find median number
        output= 15 is the median number
 */
