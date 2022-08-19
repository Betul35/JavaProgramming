package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class WarmUpTasks {

    public static void main(String[] args) {

//1.write a program that can swap the first and last element of Array
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8));

        Collections.swap(numbers, 0,numbers.size()-1); //index yaziyoruz buraya
        System.out.println(numbers);


        System.out.println("-----------------------------------------------------------------------");

//2. write a prog. that can move all the zeros to the last indexes of ArrayList, do not create additional arrayList

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,0,2,0,3,0,4,0));
        System.out.println(list);

        int size = list.size();

        list.removeAll(Arrays.asList(0));
        System.out.println(list);

        int newSize = list.size();
        int totalNumberZeros = size - newSize;
        System.out.println("totalNumberZeros = " + totalNumberZeros);

        for (int i = 0; i < totalNumberZeros; i++) {
            list.add(0); //teker teker zero numberi kadar 0 ekleyecek sonuna, onun icin loop
        }

        System.out.println(list);

        System.out.println("-----------------------------------------------------------------------");


//simdi 2. ornegi new arrayList kullanarak yapalim.

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList(1,0,2,0,3,0,4,0));

        ArrayList<Integer> result = new ArrayList<>(); // temporary olan arrayList, bunun icini dolduracagiz.

        for (Integer each : list2) {
            if (each !=0 ){ //ilk once 0 olmayanlari ekliyoruz
                result.add(each);
            }
        }
        for (Integer each : list2) {
            if (each==0){ //sonra 0 olanlari listenin sonuna eklemis oluyoruz.
                result.add(each);
            }
        }
        System.out.println(result);


        System.out.println("-----------------------------------------------------------------------");

//3. write a programm that can extract the special characters, digits and letters from a string and stores them into seperate
 //Arrays of Characters

       String str = "ACBD123425%$£@45634EFG!";

       ArrayList<Character> chars = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            chars.add(str.charAt(i));
        }
        System.out.println(chars); //burada Stringi arrayListe cevirmis olduk


        ArrayList<Character> letters = new ArrayList<>(chars);
        letters.removeIf( p-> !Character.isLetter(p)); //burada tum not letters lari cikarmis olacak, letterlar kalacak
        System.out.println("letters = " + letters);

        ArrayList<Character> digits = new ArrayList<>(chars);
        digits.removeIf( p -> !Character.isDigit(p));
        System.out.println("digits = " + digits);


        ArrayList<Character> specialChar = new ArrayList<>(chars);
        specialChar.removeAll(letters);
        specialChar.removeAll(digits); //burada da tum digit ve letter lari cikarirsak special characterler kalir.
        System.out.println("specialChar = " + specialChar);




    }

}
/*


2. write a prog. that can move all the zeros to the last indexes of ArrayList, do not create additional arrayList
                Ex:
                    list: {1,0,2,0,3,0,4,0}
                output:
                    {1,2,3,4,0,0,0,0}

  3. write a programm that can extract the special characters, digits and letters from a string and stores them into seperate
  Arrays of Characters

        Ex:
                str = "ACBD123425%$£@45634EFG!"
        OUTPUT:
                list1 : {1,2,3,4,5,6}
                list2 : {A,B,C,D,G,F,E}
                list3 : {@,£,$,%,!,&}
 */
