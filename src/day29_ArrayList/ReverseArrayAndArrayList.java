package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {

    public static void main(String[] args) {

        int[] array = {1,2,3,4,5,6}; // reverse yaopacagiz

        int[] result = new int[array.length]; //{6,5,4,3,2,1};

        int j = 0; //resulttaki index numberi verify etmek icin
        for (int i = array.length - 1; i >= 0; i--, j++) {
            result[j] = array[i];
        }
        System.out.println(Arrays.toString(result));

        System.out.println("-----------------------------------------");

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6));

        ArrayList<Integer> reverseList = new ArrayList<>(); // bu listeye ekleyecegiz reverse olanlari

        for (int i = list.size() - 1; i >= 0; i--) {
           int each =  list.get(i); // tum elemanlari loopluyoruz, sonraa..
            reverseList.add(each); // reverseList e ekliyoruz
        }
        System.out.println(reverseList);

    }

}
