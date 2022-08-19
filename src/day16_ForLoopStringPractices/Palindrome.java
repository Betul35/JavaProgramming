package day16_ForLoopStringPractices;

public class Palindrome {

    public static void main(String[] args) {

        String word ="Racecar";
        String reversed = "";

        for (int i = word.length()-1; i >=0 ; i--) {
         reversed  += word.charAt(i);
        }

        boolean isPalindrome = word.equalsIgnoreCase(reversed);

        System.out.println("isPalindrome = " + isPalindrome);
    }
}

/*
"Java" ==> "avaJ" ===> false (not the palindrome)
"Anna" ==> "annA" ===> true palindrome
"Level" "Racecar""dad" "mum" palindrome word...

 */
