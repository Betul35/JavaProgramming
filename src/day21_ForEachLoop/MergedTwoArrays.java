package day21_ForEachLoop;

import java.util.Arrays;

public class MergedTwoArrays {

    public static void main(String[] args) {
        // interview Task

        String[] group1 = {"BEtul", "Busra", "Talha"};
        String[] group2 = {"Ensar", "Gulizar"};

        String[] students = new String[ group1.length + group2.length ]; // the lengths of this array, 8, burada hepsini toplayacagiz

        int i = 0;
        for (String each : group1) {
             students[i++]= each;
        }

        for (String each : group2) {
            students[i++]= each;
        }
        System.out.println(Arrays.toString(students));

        System.out.println("------------------------------");

        char[] ch1 = {'A','B','C'};
        char[] ch2 = {'D','E','F','G','H'};

        char[] totalChar = new char[ch1.length+ ch2.length]; //setting the new array size

        int j = 0;
        for (char each : ch1) {
           totalChar[j++] = each;
        }

        for (char each : ch2) {
            totalChar[j++] = each;
        }

        System.out.println(totalChar);




    }
}
