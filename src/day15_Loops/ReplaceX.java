package day15_Loops;

import java.util.Scanner;

public class ReplaceX {

    public static void main(String[] args) {

        System.out.println("Enter a word: ");

        String word = new Scanner(System.in).next();

        word = word.replace("x", "a");
        word = word.replace("X", "a");
        System.out.println(word);
        // ya da soyle yaz
        // word.replace("x", "a").replace("X", "a"); => buna backtoback methodu diyoruz,  iki bolgenin de string olmasina. yani ayni variable olmasina dikkat et.




    }
}
/*
2. Write a program that asks user to enter a word. and replace all the x or X with character a
                    Input:
                        xcodeX
                    Output:
                        acodea


 */
