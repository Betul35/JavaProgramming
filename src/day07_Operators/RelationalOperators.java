package day07_Operators;

public class RelationalOperators {
   
    public static void main(String[] args) {
        // >, >= , <, <=
        
        boolean result1 = 200> 40; //true
        System.out.println("result1 = " + result1);
        
        boolean result2 = 300 >= 150; //ture
        System.out.println("result2 = " + result2);
        
        boolean result3 = 100>=100; //ture
        System.out.println("result3 = " + result3);
        
        boolean result4 = 7852>= 893829; // false
        System.out.println("result4 = " + result4);
        
        
        //credit score of 720 to be eligible to past the exam
        
        int creditScore = 745;
        boolean eligibleForLoan = creditScore >= 720;
        System.out.println("eligibleForLoan = " + eligibleForLoan);
        
        int score = 59;
        boolean hasFailed = score <=59;
        System.out.println("hsdFsiled = " + hasFailed);

        System.out.println("--------------------------------------");
        
        int x = 100;
        int y = 200;
        boolean equal = x==y; //false
        System.out.println("equal = " + equal);
        
        boolean result8 = "Muhtar"== "Good Guy"; //false
        System.out.println("result8 = " + result8);
        
        boolean result9 = 'A'=='a'; //false
        System.out.println("result9 = " + result9);
        
        boolean result10 = "Java"=="java"; //false
        System.out.println("result10 = " + result10);

        System.out.println("--------------------------------------");
        
        boolean result11 = 100!= 200; //true

        System.out.println("result11 = " + result11);

        boolean result12 = "Java" != "Break"; //true
        System.out.println("result12 = " + result12);

        boolean result13 = 300 != 300; // false
        System.out.println("result13 = " + result13);

        System.out.println("----------------------------------");


        
        
        
        
        
        
        
    }
    
    
    
}
