package day16_ForLoopStringPractices;

public class DigitsLettersSpecialChars {

    public static void main(String[] args) {

        String str = "Cydeo123456?! $%WoodenSpoon"; // arada bosluk da var, o da bir karakter, asagida onu yazdirmamak istiyoruz!
        //123456 allthedigits
        //CydeoWoodenspoon letters
        //?!$%&.. specialcharacters

        String digits = "";
        String letters = "";
        String specialChars = "";

        for (int i = 0; i < str.length(); i++) { //i = indexnumbers of the str
            char ch = str.charAt(i); //ch her karakteri kapsiyor

            if (ch>='0' && ch<= '9'){
                digits +=ch;
            } else if (ch>= 'A' && ch<= 'Z' || ch>= 'a' && ch<= 'z') {
                letters +=ch;
            } else {
                if (ch != ' ')
                specialChars +=ch;
            }

        }
        System.out.println("digits = " + digits);
        System.out.println("letters = " + letters);
        System.out.println("specialChars = " + specialChars);

    }
}
