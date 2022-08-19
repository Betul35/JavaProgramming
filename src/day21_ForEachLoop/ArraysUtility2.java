package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility2 {

    public static void main(String[] args) {
        //copyOf method

        String[] students = {"Elif", "Sinem", "Gunay", "Cihad" ,"David", "James", "Aaron","Daniel"};
        String[] earlyBirds = Arrays.copyOf(students, 3); // burada students arrayinden ilk 3 elementi earlybirdsd stringi yap diyoruz

        System.out.println(Arrays.toString(earlyBirds));

        int[] numbers = {1,3,4,5,6,7,8,9,10};
        numbers = Arrays.copyOf(numbers,5); //1,2,3,4,5
        System.out.println(Arrays.toString(numbers));

        System.out.println("-------------------------------");
        //copyOfRange Method

        char[] ch1 = {'A', 'B', 'C','D','E','F','G','H','I'};
        char[] ch2 = Arrays.copyOfRange(ch1,2,6);// bu index araligindaki elementleri copy yapiyoruz, ama 6 exluded!
        System.out.println(Arrays.toString(ch2));

        System.out.println("--------------------------");

        int[] scores = {10,20,30,40,50,60,70,70,80,90,100};
        int[] range = Arrays.copyOfRange(scores,3,8);
        System.out.println(Arrays.toString(range));



    }
}
