package day13_String;

import java.sql.SQLOutput;
import java.util.SortedMap;

public class StringIntro {


    public static void main(String[] args) {

        // string class import ederken kendisi otomatik olarak yaziyor, bizim yazmamiz gerekmiyor
        // String java. lang olarak implicit yani kendi yaziyor, Scan gibi explicit degil, yani biz import etmiyoruz

        // "Cydeo" veya "Java" bunlar string ve bunlarin karakterlrinin indexi var mesela c index0 y index1 d index3...
        // indexi saymaya sifirdan basliyoruz... index number starts from 0
        // string immutable dir, yani degistirilemez, can not be modified

        String str= "Wooden Spoon"; // buna, yani bu string objecte  direk String Literal diyoruz ve string literal lar String pool da toplanir.
        // Strong pool da Heap in icinde. eger same characterlar varsa sadece 1 object olusuyor string pool da yani duplicated olmuyor. soyle;

        String name = "Wooden Spoon";
        String name2 = "Wooden Spoon";
        String name3 = "Wooden Spoon";
        String name4 = "Wooden Spoon"; // bunlarin characterleri, objectleri// hep ayni, ondan String pool da 4 tane degil de 1 tane run olacak

        System.out.println(name == name2); // true
        System.out.println(name2 == name3); // true
        System.out.println(name3 == name4); // true

        System.out.println("------------------------------------------");


        String str1 = new String("Wooden Spoon");
        String str2 = new String("Wooden Spoon");
        String str3 = new String("Wooden Spoon");
        String str4 = new String("Wooden Spoon"); // bunlarin karakterleri ayni gozukse de new variable olarak kodladigimiz icin birbirlerinden farkli objectler oluyorlar
                                                            // bundan dolayi esit degiller birbirlerine
                                                            // bunlaroutside of String pool

        System.out.println(str1 == str2); // false
        System.out.println(str2 == str3); // false
        System.out.println(str3 == str4); // false

        System.out.println("---------------------------------------------------"); // esittiri kullanmanin farkli hizli bir yontemi var, hadi goz atak;

        String s1 = "Java";
        String s2 = new String("Java"); // bunu run yapmak icin soyle yaziyoruz;
        System.out.println(s1.equals(s2)); // vay beee dedirtiyor di miieee, bunun ismi equals method

        String s3= "Java";
        String s4 = new String("java"); // bunlarin simdi biri upper biri lower case
        System.out.println(s3.equals(s4));// o yuzden false cikacak heheeee











    }
}
