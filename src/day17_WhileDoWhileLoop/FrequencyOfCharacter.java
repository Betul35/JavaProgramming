package day17_WhileDoWhileLoop;

public class FrequencyOfCharacter {

    public static void main(String[] args) {

        String str = "AAABBBC";
        char ch = 'A'; // bunun kac kere yazildigini bulmaya calisacagiz

        int frequency = 0;

        for (int i = 0; i < str.length(); i++) { // i= indexes of str
            char eachChar = str.charAt(i); // burada bize tum karakterleri veriyor

            if (eachChar==ch){
                frequency +=1; // ya da soyle yaz frequency++;
            }
        }
        System.out.println(frequency);






    }
}
/*
1. Write a program that can return the frequency of a char from a String

			Ex:
				str = "AAABBBC"
				ch = 'A'

			Output:
				3
 */
