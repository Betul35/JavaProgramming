package day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {

        ArrayList<String> uniqueList = new ArrayList<>();
        uniqueList.add("Java");
        uniqueList.add("Pyhton");
        uniqueList.add("C@");
        uniqueList.add("Ruby");
        uniqueList.add("Java");
        uniqueList.add("C@");
        uniqueList.add("C@");
        uniqueList.add("C++");
        uniqueList.add("Ruby");

        System.out.println(uniqueList);

        ArrayList<String> unique = new ArrayList<>(); //yukardaki unique elementleri bulup bu variable a ekle

        for (String each : uniqueList) { //get each element of the arraylist
            if (uniqueList.indexOf(each) == uniqueList.lastIndexOf(each)){
                unique.add(each); // yukardaki line 20 eki unique isimli yere ekliyoruz
            }
        }
        System.out.println(unique);

        System.out.println("---------------------------------");






    }

}
