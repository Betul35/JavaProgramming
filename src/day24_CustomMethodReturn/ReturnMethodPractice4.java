package day24_CustomMethodReturn;

public class ReturnMethodPractice4 {

    public static void main(String[] args) {

        String str = "ccccfffffdeeeeaaaf";
        str = removeDuplicates(str);
        System.out.println(str);

    }
    //create a method that can remove the duplicated charachers from a string and returns the new value
    // yani soyle olsun istiyoruz str = "aaabbccc"==> "abc"

    public static String removeDuplicates(String str){

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (!result.contains(""+ each)){ //"" su bos string vermezsek compiler error verir, cunku contain method string tanir
                result +=each;
            }
        }

        return result;

    }





}
