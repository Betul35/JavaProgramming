package day25_CustomMethod_Overloading;

import utilities.StringUtility; //baska package lardaki utilities leri kullanmak icin import etmeyi unutma

public class TestForUtility {

    public static void main(String[] args) {

        String str = "Java Programming Language";

        StringUtility.printEachChar(str); //import etmek icin kisayol: StringUtilities yaz, o cikiyor, cunku overloading yapip kendi package ve methodumuzu kurduyduk

        System.out.println("-------------------------------");

        String str1 = "Java";
        String reverse = StringUtility.reverse(str1);
        System.out.println(reverse);

        System.out.println("--------------------------------");

        String word = "Civic";
        boolean palindrome = StringUtility.isPalindrome(word); //bizi true false cevirdigi icin boolean olarak assign yapiyoruz
        System.out.println("palindrome = " + palindrome);


        System.out.println("--------------------------------");

        String[] names = {"Anna", "Java", "Pyhton", "racecar", "Mom", "Cydeo"}; //ne kadar palindrome var onu bulalim
        int count = 0;

        for (String each : names) {
            if (StringUtility.isPalindrome(each)) {
                count++;
            }
            System.out.println(count); //3
        }

        System.out.println("--------------------------------");

        String s2 = "aaaaabbbccccccd";
        String nonDup = StringUtility.removeDuplicates(s2);
        System.out.println(nonDup);

    }
}
