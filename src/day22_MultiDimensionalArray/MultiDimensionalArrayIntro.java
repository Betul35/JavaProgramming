package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {

    public static void main(String[] args) {

        String[] group1 = {"jan","Joes","James"};
        String[] group2 = {"jan","Joes","James"};
        String[] group3 = {"jan","Joes","James"};

        String[][] groups = new String[3][]; // index: 0,1,2 this is multi dimensional array

        groups[0] = group1;
        groups[1] = group2;
        groups[2] = group3;

       // System.out.println(Arrays.toString(groups)); toString method is only for single dimensional array,
        //  for multi we have deepToString method

        System.out.println(Arrays.deepToString(groups));

        System.out.println("---------------------------------------------------------");
        /*
            {1,2,3}
            {4,5,6,7}
            {8,9,10,11,12}
         */

        //indexofthe
        //element:         0,1,2
        int[][] arr2D = { {1,2,3} , {4,5,6,7} , {8,9,10,11,12} }; //if we know what the elements are, boyle initialise yapiyoruz
                //index:     0          1             2

        // su yukardaki ilk [] = [idexofID arrays] ama ikinci []= [index of Elements]

        System.out.println(Arrays.deepToString(arr2D)); // [[1, 2, 3], [4, 5, 6, 7], [8, 9, 10, 11, 12]]

        System.out.println(Arrays.toString(arr2D[1])); //[4, 5, 6, 7]
        System.out.println(arr2D[2][3]); //11


    }
}
/*
String[] group1 = {"jan","Joes","James"}
String[] group2 = {"jan","Joes","James"}
String[] group3 = {"jan","Joes","James"}

 */
