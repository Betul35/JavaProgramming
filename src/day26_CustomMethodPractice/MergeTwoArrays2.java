package day26_CustomMethodPractice;

import utilities.ArraysUtility;

public class MergeTwoArrays2 {

    public static void main(String[] args) {



    }

    public static int[] merge(int[] arr1, int[] arr2){

        int[] result = {};

        for (int each : arr1) {
            result = ArraysUtility.addElement(result,each);
        }

        for (int each : arr2) {
            result = ArraysUtility.addElement(result,each);
        }

        return result;


    }

}
