package day34_GarbageCollections_AccessModifiers;

import static day34_GarbageCollections_AccessModifiers.Circle.pi;

public class StaticImport {

    public static void main(String[] args) {
        // import static packageName.className.staticName; bir class tan sadece 1 statigi import etmenin sintaxi
        // import static packageName.className.*; bir class tan tum static leri import etmenin sintaxi

        System.out.println(Circle.pi);// boyle yazdiriyorduk ama import ettikten sonra class name i icine yazmaya gerek yok
        System.out.println(pi);




    }


}
