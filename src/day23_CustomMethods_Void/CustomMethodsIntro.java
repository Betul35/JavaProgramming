package day23_CustomMethods_Void;

public class CustomMethodsIntro {

   public static void main(String[] args) { //main method, bir method diger methodun icinde OLAMAZ!

      System.out.println("Test started");

      greeting();

      System.out.println("Test completed");

   }

   public static void greeting(){ //bu bizim kendi create yaptigimiz methodumuz

      System.out.println("Hello Cydeo!");
      System.out.println("How are you today?");

   }


}
