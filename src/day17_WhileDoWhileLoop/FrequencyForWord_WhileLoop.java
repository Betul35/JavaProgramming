package day17_WhileDoWhileLoop;

import java.util.Locale;

public class FrequencyForWord_WhileLoop {

    public static void main(String[] args) {

        String str = "Java Java Python Python ";
        int frequency = 0;

        while (str.contains("Java")){
           str =  str.replaceFirst("Java", "");
           frequency++;

        }
        System.out.println(frequency);

        System.out.println("-----------------------------------------");


        String sentence = "cat cat Cat CAt dog dog dog cAT cat";
        int countCat = 0;
        sentence= sentence.toLowerCase();


        while (sentence.contains("cat")){
            sentence = sentence.replaceFirst("cat", "");
            countCat++;
        }
        System.out.println(countCat);


    }
}
