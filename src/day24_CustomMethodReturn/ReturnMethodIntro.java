package day24_CustomMethodReturn;

public class ReturnMethodIntro {

    public static void main(String[] args) {

        String str = "Java";
        String result = reverse(str);
        System.out.println(result); // iste burada reverse yaptigim str ye istedigim islemi yapabilirim, mesela palindrom mu bakalim

        if (str.equalsIgnoreCase(result)){
            System.out.println(str + " is a palindrome");
        }else{
            System.out.println(str + " is NOT a palindrome");
        }


    }

    public static String reverse(String str){ // "Java" bunu reverse yapip sonradan da kullanmak istiyorum, bunun icin return methoda ihtiyacim var
        String reverse = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reverse+=str.charAt(i);
        }

        return reverse; // return methodu kullandigim yer, method void olmaadigi icin bunu yazmaliyim!
    }


}
