package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(10,4,5,6,2,7,8,9,1,3));

    //sort Method
        Collections.sort(list);
        System.out.println(list);


    //reverse method
        ArrayList<Character> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList('A', 'E', 'B', 'Y', 'P'));
        Collections.reverse(list2);
        System.out.println(list2);


    //swap method
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList(10,20,30,40,50,60,70));
        Collections.swap(list3,2,3);
        System.out.println(list3);


    //max, min method
      int max = Collections.max(list3);
      int min = Collections.min(list3);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    //replaceAll method
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.addAll(Arrays.asList(10,10,30,2,0,35,10,67,10,90,90));
        Collections.replaceAll(list4,10,100);
        System.out.println(list4);


    //frequency method
       int frequency = Collections.frequency(list4,100);
        System.out.println("frequency = " + frequency);

        System.out.println("-----------------------------------");

        ArrayList<String> words = new ArrayList<>();
        words.addAll(Arrays.asList("Java","Java","Java","Pyhton","Pyhton", "Pyhton"));
        int countJava = Collections.frequency(words,"Java");
        int countPyhton = Collections.frequency(words,"Pyhton");
        System.out.println("countJava = " + countJava);
        System.out.println("countPyhton = " + countPyhton);

    }
}
