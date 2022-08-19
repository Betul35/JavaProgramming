package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {
        // interview sorusu

        String sentence = "I Love Java";
        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));

        String reversed = ""; // hedef sadece 2. world u reverse yapmak, index:1 olan

        for (int i = words[1].length()-1; i >=0 ; i--) {
            reversed += words[1].charAt(i);
        }
        System.out.println(reversed); // burada evoL u elde ettik, simdi bunu replace yapmaliyiz.

       sentence = sentence.replaceFirst( words[1],reversed );

        System.out.println(sentence);

        /*
        second solution is: ilk word[1] i reverse ile degistirecegiz, sonra da for each loop ile tum kelimeleri runlicaz

        words[1] = reversed;

        for ( String word : words) {
              System.out.print(word+ " " );
        }

         */






    }
}
/*

Write a program that can reverse the second word of the sentence
			Ex:
				sentence = "I Love Java";

			output:
				I evoL Java

 */