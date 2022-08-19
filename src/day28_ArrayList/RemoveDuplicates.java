package day28_ArrayList;

import java.util.ArrayList;

public class RemoveDuplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(10);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(30);
        list.add(30);

        ArrayList<Integer> result = new ArrayList<>(); //{10,20,30};

        for (Integer each : list) {
            if (result.contains(each)){
                continue;
            }
            result.add(each);
        }
        System.out.println(result);

        System.out.println("---------------------------------------");

//equals() method :

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(100);
        list1.add(100);
        list1.add(100);

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(100);
        list2.add(100);
        list2.add(100);

        System.out.println(list1 == list2); // bu bizi false a cevirecek, cunku olustururken new keyword unu kullandik,
                                            // yani bunlar ayni gibi gorunse de farkli data lar!
                                            //onun icin equals() methodu kullanacagiz

        System.out.println(list1.equals(list2)); //simdi true ya cevirecek

        System.out.println("---------------------------------------");

//isEmpty():
        list1.clear();
       boolean r4 = list1.isEmpty();
        System.out.println(r4);







    }

}
