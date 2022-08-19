package day15_Loops;

public class StringMethods {
    public static void main(String[] args) {

        System.out.println("------------isEmptyMethod--------------");

        // true false ceviriyor, yani boolean olarak assing edebiliriz

        String str = "";
        boolean r= str.isEmpty();
        System.out.println(r);

        String str2 = " "; //empty degil ama blank!
        boolean f = str2.isEmpty();
        System.out.println(f);

        System.out.println("-------------isBlank Method--------------------");

        // if String is blank , it is going to return true, otherwise false.

        boolean k = str2.isBlank();
        System.out.println(k);
        String str3 = "Cydeo";
        boolean g = str3.isBlank();
        System.out.println(g);

        System.out.println("----------------------equals method----------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));// cunku herseyiyle ayni ariyor, letter lar ayni ama upper lower case, ondan equal degil
        System.out.println(s1.equalsIgnoreCase(s2)); // burada upper lower i ignore ediyor, sadece carakterler ayni mi ona bakii

        String equalMi = "  Betul";
        String equalMi2 = "BETUL";
        System.out.println(equalMi.equalsIgnoreCase(equalMi2));

        System.out.println("----------------------contains Method----------------");

        String sen1 = "My favorite programming language is Java";
        boolean has£ = sen1.contains("£");
        boolean hasJava = sen1.contains("Java");
        System.out.println(has£);
        System.out.println(hasJava);
        boolean hasjava = sen1.contains("java");
        System.out.println(hasjava); // bu lower case i ignore etmiyor, ama biz soyle yazip ignire edebiliriz.
        boolean hasjava2 = sen1.toLowerCase().contains("java");
        System.out.println(hasjava2);

        System.out.println("------------------------------------------");
        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2)); //false
        System.out.println(input1.equalsIgnoreCase(input2));
        System.out.println(input1.contains(input2));

        System.out.println("-----------------------startsWith method----------------");

        String a ="Wooden Spoon";
        boolean x = a.startsWith("Woo"); // burada soruyoruz a Woo ile mi basliyor diye, cevap true
        System.out.println(x);

        System.out.println("--------------------------endswith method=---------------------");

        boolean y = a.endsWith("noo"); // noo ile mi bitiyor diye soruyoruz
        System.out.println(y);



    }

}
