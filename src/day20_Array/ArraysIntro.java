package day20_Array;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        // create a variable that is capable enough to contain 5 names
        String[] myGroup = new String[5];
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Betul";
        myGroup[4] = "Serap";



        // System.out.println(myGroup); eger boyle runlarsan hashcode veriyor, yani error gibi bisey [Ljava.lang.String;@3f0ee7cb soyle bir sey

        System.out.println(Arrays.toString(myGroup)); //bunu yazinca 3. line dayi util package oluyor otomatikman

        System.out.println("-------------------------------------");


        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday","Saturday","Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 5;
        if (number<1 || number>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);


        System.out.println("-----------------------------");

        String[] months = {"January","February","March", "April","May","June","July","August","September","October","November","December"};
        System.out.println(Arrays.toString(months));

        int num1 = 3;
        if (num1<1|| num1>13){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(months[num1-1]);

        for (int i = 0; i < months.length; i++) { //i birada the index number of array
            System.out.println(months[i]);
        } // bu for loop da tum months lari run yapmak icin

        System.out.println("-------------------------------");
        for (int i = months.length-1; i >=0 ; i--) {
            System.out.println(months[i]);
        }



    }
}
