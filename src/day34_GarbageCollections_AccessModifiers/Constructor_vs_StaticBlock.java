package day34_GarbageCollections_AccessModifiers;

public class Constructor_vs_StaticBlock {

    static {
        System.out.println("Static Block"); //ilk bu run olacak, cunku static ilk run olur
    }

    public Constructor_vs_StaticBlock(){ // bu run olmayacak cunku constructor is related with object, and there is no object here
        System.out.println("Constructor"); //bunu run amak icin main methodun icine object olusturmak lazim o da soyle
                                            // new Constructor_vs_StaticBlock(); bunu mainin icine yazmaliyiz
    }

    public static void main(String[] args) { //2. defa da bu run olacak
        System.out.println("Main method");
    }


}
