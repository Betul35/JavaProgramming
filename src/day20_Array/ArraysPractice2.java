package day20_Array;

import java.util.Arrays;

public class ArraysPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];
        /*
        letters[0] = 'A';
        letters[1] = 'B;
        ....
         */

        for (char i ='A' , j=0; i<='Z' && j< letters.length ; i++,j++){ // 2 variables, 2iterations, 2 conditions
            letters[j] = i;
        }

        //veya bunun daha kolay bir yontemi daha var, 1 variables iteration kullanarak;

       /* char ch = 'A';
        for (int i = 0; i< letters.length; i++){
            letters[i] = ch++;
        }
        */

        System.out.println(Arrays.toString(letters)); // [A~Z]





    }
}
