package day26_CustomMethodPractice;

import utilities.ArraysUtility;

import java.util.Arrays;

public class ReverseArray2 {

    public static int[] reverse(int[]array){

        int[] result = {}; //temporary array olusturuyoruz, sonra da son index of array dan baslayip resulta ekleyecegiz

        for (int i = array.length - 1; i >= 0; i--) {
            result = ArraysUtility.addElement(result,array[i]);
        }
        return result;
    }

}
