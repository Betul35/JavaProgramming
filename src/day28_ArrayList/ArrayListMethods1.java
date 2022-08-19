package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 { //arraylist is the part of the collection

    public static void main(String[] args) {

//add() method
     ArrayList<Integer> numbers = new ArrayList<>();
     numbers.add(10); //burada add methodu kullaniyoruz, ve size ini genisletiyoruz arraylist in, bu index 0
      numbers.add(20); //index 1
      numbers.add(10);//index 2
      numbers.add(80);//index 3
      numbers.add(653);//index 4
      numbers.add(5,23);

      System.out.println(numbers);
        //add methodu soyle de ekleyebiliriz : add(index, data);

//size() method
        System.out.println(numbers.size()); //getting the total number of arraylist

        int lastIndex = numbers.size()-1; // last index:
        System.out.println("lastIndex = " + lastIndex);

//get() method : get(index): returns the element at the given index
       int num = numbers.get(3); // indexi 33 olan elementi getiriyor
        System.out.println("num = " + num);

        System.out.println("------------------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        System.out.println("------------------------------------------------");

//set method : set(index, Data) replacing index a new element
        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Pyhton");
        list.add("C@");
        list.add("Ruby");
        list.add("Java");

        list.set(0,"JavaScript");
        System.out.println(list);






    }

}
