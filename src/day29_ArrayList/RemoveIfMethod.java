package day29_ArrayList;

import utilities.StringUtility;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveIfMethod {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        list.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));
        System.out.println("list = " + list);

        /*
        for (int i = 0; i < list.size(); i++) {
           if (list.get(i) %2 !=0){
               list.remove(i);
           }
        } boyle yapinca her remove yaptiginda index numarasi da azaldigindan, iteration da dogru seti remove etmediginden bu yontemi kullanmiyoruzm
        */

        System.out.println(list);

        list.removeIf(p -> p<5); // 5 ten kucuk elemanlari remove etmek istiyoruz, called Lambda Expression
        System.out.println(list);

        System.out.println("--------------------------------------");

        ArrayList<Integer> list2 = new ArrayList<>();
        list2. addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        list2.removeIf( each -> each%2 ==0); //even numberlari bulmaya calisiyoruz, (it implicitly use Iterable, bunu ogrenecez)

        System.out.println(list2);

        System.out.println("--------------------------------------");

        ArrayList<String> list3 = new ArrayList<>();
        list3.addAll(Arrays.asList("Java", "Pyhton","JavaScript","C@","C++","Java","Java"));

        list3.removeIf( p -> p.startsWith("J") ); //J ile baslayanlari cikaracak
        System.out.println(list3);


        System.out.println("--------------------------------------");

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Anna", "Racecar","Level","Eye","Java","Pyhton","Cydeo")); //remove all the palindrome

        names.removeIf( p -> StringUtility.isPalindrome(p));
        System.out.println(names);








    }

}
