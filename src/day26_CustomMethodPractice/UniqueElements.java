package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class UniqueElements {

    public static void main(String[] args) {
        int[] array = {11,1,1,2,3,3,6,6,7,5,9,5,50};
        int[] unique = uniqueElements(array);
        System.out.println(Arrays.toString(unique));

        System.out.println("-------------------------------------");

        double[] array2 = {3.4,34.4,3.,4,67.8,67.8,563.5,7.8,0.17};
        double[] unique2 = uniqueElements(array2);
        System.out.println(Arrays.toString(unique2));

        System.out.println("-------------------------------------");

        char[] array3 = {'a','a','G','R'};
        char[] unique3 = uniqueElements(array3);
        System.out.println(Arrays.toString(unique3));



    }

    //returns the unique elements of the array as a new array
    public static int[] uniqueElements(int[] array){
        int[] result = {}; // empty array veriyoruz ki sonunda unique elementler array olustursun.

        for (int each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) ==1 ){ //frequency 1 ise element unique dir.
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    //returns the unique elements of the array as a new array
    public static double[] uniqueElements(double[] array){
        double[] result = {}; // empty array veriyoruz ki sonunda unique elementler array olustursun.

        for (double each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) ==1 ){ //frequency 1 ise element unique dir.
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    //returns the unique elements of the array as a new array
    public static String[] uniqueElements(String[] array){
        String[] result = {}; // empty array veriyoruz ki sonunda unique elementler array olustursun.

        for (String each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) ==1 ){ //frequency 1 ise element unique dir.
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }


    //returns the unique elements of the array as a new array
    public static char[] uniqueElements(char[] array){
        char[] result = {}; // empty array veriyoruz ki sonunda unique elementler array olustursun.

        for (char each : array) {
            if (ArraysUtility.frequencyOfElement(array,each) ==1 ){ //frequency 1 ise element unique dir.
                result = ArraysUtility.addElement(result,each);
            }
        }
        return result;
    }

}
