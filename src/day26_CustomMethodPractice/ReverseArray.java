package day26_CustomMethodPractice;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        int[] arr = {1,3,32,4,3,5};

        int[] result = reverse(arr);
        System.out.println(Arrays.toString(result));
    }

    public static int[] reverse(int[] array){
        int[] result = new int[array.length]; // yeni bir array olusturduk ,reverse ederek icini dolduracagiz

        for (int i = array.length - 1, j=0; i >= 0; i--, j++) { //burada i arrayin index numberi, j de resultun index numberi
            result[j] = array[i];
        }

        return result;
    }

}
