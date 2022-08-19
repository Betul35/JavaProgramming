package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {
        //toCharArray Method bizi char arraye goturuyor

        /* normalde boyle yazabilirsin, ama re usable yapmak icin assing yaparak yapalim
        String str = "Java";


        for (char each : str.toCharArray() ){ // tum karakterleri char array olarak yazdiriyor
            System.out.println(each);
        }

    */

        String str = "Java";
        char[] chars = str.toCharArray();//assign yapiyoruz ki kullanabilelim sonradan

        System.out.println(Arrays.toString(chars));

        for (char each : chars){
            System.out.println(each);
        }





    }

}
