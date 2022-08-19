package day14_StringMethods;

public class StringMethod2 {

    public static void main(String[] args) {

        System.out.println("----------------------------Replace---------------------");

        String str = "Java is fun, I love learning Java";
       String str2 =  str.replace("Java" , "Phyton"); // "Phyton is fun, I love learning Phyton"

        System.out.println("str = " + str);
        System.out.println("str2 = " + str2);

        String email= "JohnSmith@yahoo.com"; // change yahoo to g mail
       email = email.replace("yahoo" , "gmail");
        System.out.println("email = " + email);

        String sentence = "Java Java Phyton Phyton Phyton C++ C++ Phyton Phyton Phyton Phyton"; // phytonlari cikarmak istiyoruz.
        sentence = sentence.replace(" Phyton" , "");
        System.out.println("sentence = " + sentence);

        String s = "Dog Dog Dog Dog Dog Dog"; //kopusleri kediere cevir ;D
         s = s.replace("Dog", "Cat");
        System.out.println("s = " + s);











    }
}
