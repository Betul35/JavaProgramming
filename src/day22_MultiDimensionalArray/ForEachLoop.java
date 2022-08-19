package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {

    public static void main(String[] args) {

        //indexofthe
        //element:         0,1,2
        int[][] arr2D = { {1,2,3} , {4,5,6,7} , {8,9,10,11,12} }; //if we know what the elements are, boyle initialise yapiyoruz
        //index:     0          1             2

        for (int[] eachSingleArray : arr2D) {
            // System.out.println(Arrays.toString(eachSingleArray));

            for (int eachElement : eachSingleArray) {
                System.out.println(eachElement);
            }
        }




    }
}
