package day20_Array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysPractice1 {


    public static void main(String[] args) {
        // store this elements 10,20,50,70

        int[] numbers = {10,20,50,70}; // the size is 4, bnun degistiremeyiz

        System.out.println(Arrays.toString(numbers));

        System.out.println("------------------------------");
        //Create a variable that can contain 5 scores

        int[] scores = new int[5];
        scores[0] = 45;
        scores[1] = 0;
        scores[2] = 55;
        scores[3] = 75;
        scores[scores.length-1] = 10;
        System.out.println(Arrays.toString(scores));







    }
}
