package utilities;

import java.util.Arrays;

public class StringUtility { //mesela String methodlarin icinde print each of the characters yok, onu biz olusturacagiz

    //prints each characher of the given string
    public static void printEachChar(String str){

        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    //reverses the given string and return the reversed string
    public static String reverse(String str){ //"Java"
        String result = "";

        for (int i = str.length()-1; i >=0; i--) {
            result += str.charAt(i);
        }

        return result; //"avaJ"

    }

    //checks if the give String is palindrome, returns boolean at the end
    public static boolean isPalindrome(String str){
        return  reverse(str).equalsIgnoreCase(str);
    }


    //checks if the given string is anagram, return boolean
    public static boolean anagram(String str1, String str2){ //"acb" ,"bca"
        char[] ch1 = str1.toCharArray(); //ilk array olarak yaz ki sort edesin
        char[] ch2 = str2.toCharArray();

        Arrays.sort(ch1); // sort et ve bak bakalim esitler mi
        Arrays.sort(ch2);

        return Arrays.equals(ch1,ch2); //boolean, esitse true, return et ki kullanabilesin.

    }


    //removes the duplicates from given String, return  String. "aaaaaaabbcccc"==> "abc
    public static String removeDuplicates(String str){

        String result ="";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (!result.contains(each+ "")){ //each of the character yeni geleni icermiyorsa, ekle
                result +=each;
            }
        }

        return result;
    }


}

