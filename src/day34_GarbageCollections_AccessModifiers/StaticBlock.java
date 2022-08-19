package day34_GarbageCollections_AccessModifiers;

public class StaticBlock {

    public static void main(String[] args) {

        System.out.println("Main method");

    }

    static{ // runs first before anything, and only one time

        System.out.println("Static Block");

    }





}
