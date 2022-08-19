package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethod2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(200);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

       /*
       int num = 1;
       list.remove(num);
       System.out.println(list); // burada int oldugundan index olarak algilar ve index 1 i remove edecek.
        */

        Integer num = 200;
        list.remove(num); //burada element olan 200 olani cikartacak, bunu boolean olarak assign ederiz, cunku object olarak remove ediyor.
        System.out.println(list);

        System.out.println("----------------------------------------");

        //clear() method: herseyi clear yapiyor, tumunu cikariyor, temizliyor size 0 oluyor

        System.out.println(list.size());
        list.clear();
        System.out.println(list.size()); //burada size 0 olacak clear method uyguladigimiz icin

        System.out.println("----------------------------------------");

//indexOf(Data): return you the first matching index number
//lastIndexOf(data) : return you the last matching index number

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A'); //0
        int b = characters.lastIndexOf('A'); //4

        System.out.println(a);
        System.out.println(b);

        System.out.println("----------------------------------------");

        boolean r2 = characters.contains('A'); //true
        boolean r3 = characters.contains('H'); //false
        System.out.println("r2 = " + r2);
        System.out.println("r2 = " + r2);






    }
}
