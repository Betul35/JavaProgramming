package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {
        //argument must be a collection type

//addAll(CollectionType); add collection of values
        //asList(array of values)==> returns the array as a collection type

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,3,3,5,5,8,8,43543,764));
        System.out.println(list);


//removeAll(CollectionType);

        list.removeAll(Arrays.asList(3,5,8));// listenin icindeki tum 3,5,8 leri remove ediyor, specifying element, not index!


//retainAll(CollectionType); //remove all the UNMATCHING elements

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(100,200,300,400,50,600,200,300,900));

        numbers.retainAll(Arrays.asList(100,200,300)); //bu elementleri tutmak istiyorum, digerleri remove olsun, bunun icin retain !
        System.out.println(numbers);

        System.out.println("---------------");

        ArrayList<String> jobTitles = new ArrayList<>();
        jobTitles.addAll(Arrays.asList("psik","dok","QA","SDET","Developer","BA","Scrum Master","psik","dok"));
        jobTitles.retainAll(Arrays.asList("QA","SDET")); // bunalari tutacak, digerlerini remove layacak\
        System.out.println(jobTitles);


//containsAll(CollectionType);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9,5,7,65,7,653));

        boolean r1 = nums.containsAll(Arrays.asList(3,4,5,10)); //false, cunku 10 yok
        System.out.println("r1 = " + r1);


        System.out.println("--------------------------------------");


        String[] names = {"Josh","Betul","Daniel","Syah"};

        //ArrayList<String> namesList = new ArrayList<>();
        //namesList.addAll(Arrays.asList(names));  burada array i collection a convert ettik, ama daha kisa yolu var:

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names)); // bu daha kisa
        System.out.println(namesList);


        System.out.println("--------------------------");


        Integer[] arr = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr));
        System.out.println(list2);


        System.out.println("--------------------------");

        int[] arr2 = {1,2,3,4,5,6,7,8,9};
        ArrayList<Integer> list3 = new ArrayList<>(convertArrayToArrayList(arr2));
        System.out.println("list3 = " + list3);



    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array){
        ArrayList<Integer> list = new ArrayList<>();

        for (Integer each : array) {
            list.add(each);
        }

        return list;
    }

}
