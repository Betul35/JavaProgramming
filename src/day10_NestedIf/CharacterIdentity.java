package day10_NestedIf;

public class CharacterIdentity {


    public static void main(String[] args) {

        char ch = '@';

        // burada 3 possibilities var, Askii table a bakarsak, bu isaret digit olabilir, number olabilir, alfabe olabilir

        if (ch>='0' && ch<='9'){
            System.out.println("Digit");
        } else if ((ch>='A' && ch<='Z') || ch>='a' && ch<='z'){
            System.out.println("Alphabetic");
        }else {
            System.out.println("Special Character");
        }

        System.out.println("5 + 2 = " + (3 + 4));
        System.out.println(10/3);
        System.out.println((int) 10/3);
    }
}


