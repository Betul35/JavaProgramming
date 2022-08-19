package day18_NestedLoop;

public class NestedLoopIntro {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println("Wooden Spoon");
        }
        // boyle bir suru yazmak yerine for icinde for yazip, halledebiliriz, nested loop diyoruz buna

        System.out.println("-----------------------------");

        for (int j = 0; j < 5; j++) { // 0,1,2,3,4, // OUTER LOOP
            for (int i = 0; i < 5; i++) {           // INNER LOOP
                System.out.println("Wooden Spoon");
            }                         // 0,1,2,3,4 yani toplam 25 kere Wooden Spoon yazilacak
        }




    }
}
