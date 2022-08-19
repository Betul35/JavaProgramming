package day25_CustomMethod_Overloading;

import java.util.Arrays;

public class MethodOverloadingIntro {

    public static void main(String[] args) {

        int[] intArray = {5,2,5,-7,0};
        Arrays.sort(intArray); //kucukten buyuge siraliyor
        System.out.println(Arrays.toString(intArray));

        double[] doubleArray = {4.6,20.3,5.7,9.8};
        Arrays.sort(doubleArray);
        char[] charArray = {'E','U','Q','A','C'}; // mesela bunlari sort etmek istiyoruz. ama ayri sort larimiz yok,
        Arrays.sort(charArray);                                           // cunku sort method overloading methoddur.

        System.out.println("---------------------------------------------");

        //sum of 10 and 20
        int sum1 = sumOfNumbers(10,20);

        //sum of 10 and 20 and 30
        int sum2 = sumOfNumbers(10,20,30);




    }

    public static int sumOfNumbers(int num1, int num2){
        return num1+num2;
    }

    public static double sumOfNumbers(double num1, double num2){
        return num1+num2;
    }

    public static int sumOfNumbers(int num1, int num2, int num3) {
        return num1 + num2 + num3;

    }

     public static double sumOfNumbers(double num1, double num2, double num3) {
         return sumOfNumbers(num1, num2) + num3;


     }
}
