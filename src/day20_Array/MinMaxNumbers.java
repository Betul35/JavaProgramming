package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxNumbers {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter a number bilizzz: ");
          numbers[i] = scan.nextInt(); // yazilan her bir numara array in icine eklenecek, sonunda 10 adet element olacak elimizde

        }

        int max = numbers[0];
        int min = numbers[0]; // bunlar just an assumption, sonra da hepsini compare yapacagiz loop ile

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] >max ){
              max = numbers[i];
            }

            if (numbers[i] <min ){
                min = numbers[i];
            }


        }
        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("max = " + max);
        System.out.println("min = " + min);

        scan.close();





    }
}
