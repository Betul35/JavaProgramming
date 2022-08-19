package day17_WhileDoWhileLoop;

public class DoWhileLoopIntro {

    public static void main(String[] args) {

        boolean a = false;
        for (int i = 0; a;) {
            System.out.println("Wooden Spoon- for loop"); // bu hicbir zaman executed olmayacak, cunku false
        }

        while (a){
            System.out.println("Wooden Spoon --while loop"); // bu hicbir zaman executed olmayacak, cunku false
        }

        System.out.println("-----------------------------------");

        do {
            System.out.println("Wooden Spoon-do while loop"); // bu false olsa bile ilk execute oluyor
        }while (a);



    }
}
