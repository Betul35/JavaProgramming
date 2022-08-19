package day20_Array;

import java.util.Arrays;

public class Alphabet {

    public static void main(String[] args) {

        // 'Z' ~ 'A'
        char[] alphabets = new char[26];
        /*alphabets[0] = 'Z';
        alphabets[1] = 'Y';
        ..... boyle boyle gidecek
        */




        for (char i = 'Z', j = 0; j< alphabets.length; i--, j++){
            alphabets[j] = i;
        }

        System.out.println(Arrays.toString(alphabets));
        System.out.println(alphabets[0]); // print the element of array


    }
}
