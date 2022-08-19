package day25_CustomMethod_Overloading;

import utilities.ArraysUtility;

public class TestForUtility2 {

    public static void main(String[] args) {

        int[] arr1 = {1,2,3,4,5};
        ArraysUtility.printEachElement(arr1);

        System.out.println("-------------------------------------");

        double[] arr2 ={1.5,2.5,4.6,6.3,7.9};
        ArraysUtility.printEachElement(arr2);

        System.out.println("-------------------------------------");

        char[] arr3 ={'A','R','U','B'};
        ArraysUtility.printEachElement(arr3);

        System.out.println("-------------------------------------");

        String[] arr4 = {"Betul","Busra","Talha"};
        ArraysUtility.printEachElement(arr4);
        
        System.out.println("-------------------------------------");

        int[] n1 = {1,4,3,7,9,4576};
        int max1 = ArraysUtility.max(n1);
        System.out.println("max1 = " + max1);

        double[] d1 = {4.5,654.754,45.6,89.76,};
        double m2 = ArraysUtility.max(d1);
        System.out.println("m2 = " + m2);

        System.out.println("-------------------------------------");
        
        int[] num = {6,546,65,45,7,546};
        boolean bol = ArraysUtility.contains(num,65);
        System.out.println("bol = " + bol);
                
        

    }

}
