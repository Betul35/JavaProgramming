package day15_Loops;

import java.util.Scanner;

public class StartWithX {

    public static void main(String[] args) {


        System.out.println("Enter word please ");
        String word = new Scanner(System.in).next(); // eger user dan bir tane scan sey girmesini istiyorsan,boyle yazabilirsin

       if (word.charAt(0)=='x'){
           word = word.replaceFirst("x", "a"); // burada create new string object cunku string is immutable
       }
        System.out.println(word);






    }

}
/*

	1. Write a program that asks user to enter a word. If the word starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */
