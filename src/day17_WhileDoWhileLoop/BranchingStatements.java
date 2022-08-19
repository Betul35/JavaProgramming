package day17_WhileDoWhileLoop;

import java.util.Scanner;

public class BranchingStatements {

    public static void main(String[] args) {

        for (char  i = 'A'; i < 'Z'; i++) {
            System.out.print(i + " ");

            if (i=='F'){
                break; // burada sunu diyoruz F e kadar yaz, sonrasini yazma, ama f i icine aldi, cunku print yukarda
            }

        }
        System.out.println();
        System.out.println("-----------------------------");

        Scanner scan = new Scanner(System.in);

        while (true){
            System.out.println("Enter a number: ");
            int num = scan.nextInt();

            if (num<0){
                break;
            }
        }




    }
}
