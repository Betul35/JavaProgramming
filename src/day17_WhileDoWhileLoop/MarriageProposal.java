package day17_WhileDoWhileLoop;

import java.util.Scanner;

public class MarriageProposal {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Will you marry me?");
        String answer = scan.next(); // veya ignore the case yapmak istersen burada da .toLowerCase() ekleyebilirsin
        while (!(answer.equalsIgnoreCase("yes") || answer.equalsIgnoreCase("no"))){
            System.err.println("Dogru duzgun cevap verirsen...\nEvlenecen mi?");
            answer = scan.next();
        }
        if (answer.equalsIgnoreCase("yes")){
            System.out.println("Congratulations");
        }else {
            System.out.println("You snooze you loose, hadi herkes kendi yoluna!");
        }



    }
}
