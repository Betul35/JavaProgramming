package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        System.out.println(list);

        for (int i = 0; i < list.size(); i++) {
            list.set(i,list.get(i)*2 ); //set(index,data)
        }
        System.out.println(list);

        System.out.println("------------------------------");

//remove() method

        ArrayList<String> employees = new ArrayList<>();
        employees.add("Suat");
        employees.add("Aygun");
        employees.add("Olga");
        employees.add("Neira");
        employees.add("Hulya");
        employees.add("Ali");
        employees.add("Kaloyan");

        System.out.println(employees);

        employees.remove(0); //burada index 0 yu remove ediyor
        System.out.println(employees);

        //remove(object) bu da remove method ama bu given object i remove diyor

       boolean r1 = employees.remove("Hulya"); // remove the object, bizi boolean a ceviriyor
        System.out.println("r1 = " + r1);


    }

}
/*
{1,2,3,4,5,6} sonunda soyle bir ciktimiz olacak
{2,4,6,8,10,12}
 */