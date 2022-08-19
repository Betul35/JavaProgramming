package day15_Loops;

public class Alphabeth_ForPractice {

    public static void main(String[] args) {

        for (char i = 65; i<=90; i++){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------");

        for (char i = 97; i<123; i+=1){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------");

        for (char i=90; i>=65; i--){
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("----------------------------");

        for (char i = 122; i>96; i-=1){
            System.out.print(i + " ");
        }

        // ya da soyle yaziyoruz
        /*
            for (int i = 65; i<=90; i++){
            System.out.print((char)i+" ");
        }
        for (char i = 'Z'; i>='A'; i--)     gibi de yazabiliriz


         */




    }
}
/*
        A~Z
        a~z
        Z~A
        z~a
 */
