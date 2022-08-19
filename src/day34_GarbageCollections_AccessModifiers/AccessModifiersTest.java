package day34_GarbageCollections_AccessModifiers;

public class AccessModifiersTest {

    public static void main(String[] args) {
        System.out.println(AccessModifiers.publicData); // her zaman visible
        System.out.println(AccessModifiers.defaultData); //default ayni package de visible ama farkli package de ve class ta degil
       // System.out.println(AccessModifiers.privateData); bu visible degil, cunku ayni class ta degil
    }

}
