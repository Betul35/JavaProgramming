package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        //write a program that can check if str1 str2 are anagram.

        String str1 = "acdb";
        String str2 = "dbca";

        char[] charStr1 = str1.toCharArray();
        char[] charStr2 = str2.toCharArray();

        System.out.println(Arrays.toString(charStr1));
        System.out.println(Arrays.toString(charStr2));

        Arrays.sort(charStr1);
        Arrays.sort(charStr2);

        System.out.println();

        System.out.println(Arrays.toString(charStr1));
        System.out.println(Arrays.toString(charStr2));

        boolean anagram = Arrays.equals(charStr1,charStr2);
        System.out.println(anagram);

        System.out.println("--------------------------");
        // split method

        String sentence = "Wooden Spoon";

       String[] words =  sentence.split(" ");
        System.out.println(Arrays.toString(words));

        System.out.println("----------------------------");

        String email = "Betulpiyade@gmail.com";

       String[] arr = email.split("@");

        System.out.println(Arrays.toString(arr));

        System.out.println("-----------------------------");

        String s = "Today is a nice day. Today is Monday. Today we learn Java.";

       String[] sentence1 =  s.split("\\. "); // nokta special characterdir. . yi \\ ile kullaniriz
        System.out.println(Arrays.toString(sentence1));







    }
}
