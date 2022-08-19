package day14_StringMethods;

public class StringMethod4_ {

    public static void main(String[] args) {

        String str = "Cydeo"; // repeat it 4 more times

       String str2 = str.repeat(4); // "CydeoCydeoCydeoCydeo"
        System.out.println(str2);

        String s1 = "Wooden Spoon ";
       String s2 = s1.repeat(100);
        System.out.println(s2);

        System.out.println("-------------------------------------------------");

        System.out.println("FADY\n".repeat(13)); // boyle de yazabiliriz run methodun icine

        System.out.println("---------------------------------------");

        String name = "BEtul";
        System.out.println( (name + " ").repeat(21));
        System.out.println( (name + "\t").repeat(12));


    }
}
