package day29_ArrayList;

import java.util.ArrayList;

public class MaxMinAverage {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);

        System.out.println(list);

        int max = list.get(0);// birinci lkarakterin max oldugunu farzediyoruz.

        for (Integer each : list) {
            if (each>max){
                max = each;
            }
        }

        System.out.println("max = " + max);

        int min = list.get(0);

        for (Integer each : list) {

            if (each<min){
                min = each;
            }
        }
        System.out.println("min = " + min);

        int sum = 0;

        for (Integer each : list) {
            sum +=each;
        }


        double average = (double)sum / list.size(); // double a convert ediyoruz ki double olacagi kesin olsun
        System.out.println("average = " + average);




    }

}

/*
2. Write a program that can find the maximum, minimum and average number from an arrayList of integers

 */
