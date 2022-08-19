package day07_Operators;

public class ShortHandOperator {

    public static void main(String[] args) {
        
       //assignment: =  ' = this is a assignment 
       int number = 100;
        System.out.println("number = " + number); //100
        
        number = 200;
        System.out.println("number = " + number); //200
        System.out.println("--------------------------");
        
        String word = "Java programming";
        System.out.println("word = " + word);

        word = "Wooden Spoon";
        System.out.println("word = " + word);

        word = "Bitil";
        System.out.println("word = " + word);

        System.out.println("-----------------------------------");

        //Additional Assignment
        int x = 100;
        System.out.println("x = " + x); // ganna give 100
        System.out.println(x+ 200); // ganna give 300

         x = x + 200; // we have a shortcut   which is x +=200;

        x+=200;

        System.out.println("x = " + x);

        String str = "Wooden";
        str += " Spoon";

        double num1= 2.5;
        System.out.println("num1 = " + num1); //2.5

        num1 += 5.5;
        System.out.println("num1 = " + num1); //8


        double availableBalance = 1000.50;
        //deposit 300$

        availableBalance += 300;
        System.out.println("availableBalance = " + availableBalance + "$"); //1300.5


        System.out.println("-----------------------------------");
        
        //withdrawing 500$
        
        availableBalance -= 500; //800
        System.out.println("availableBalance = " + availableBalance);
        
        //withdrawing 200$, then depositing 400$
        
        availableBalance -= 200;
        availableBalance  += 400;
        
        System.out.println("availableBalance = " + availableBalance + "$" );
        System.out.println("-----------------------------------");
        
        //multification ASddition
        
        double salary = 50000.50;
        salary *= 2;

        System.out.println("salary = " + salary);
        
        double doge = 0.00000001;
        doge *= 1000000;
        System.out.println("dodge = " + doge);

        System.out.println("-----------------------------------");

        //Division Assignment
        double num2 = 25000.0;
        num2 /= 2;

       

        //Remainder Assignment

        double num3 = 100;
        // %=
        num3 %= 3;
        System.out.println("num3 = " + num3);

        int amount = 127; //cents

        int quarters = 127/ 25;
        int cents = 127 % 25 ;
        System.out.println("quarters = " + quarters);
        System.out.println("cents = " + cents);
        
        System.out.println("-----------------------------------");
        
        int cents2 = 127;
        cents2 %=25;

        System.out.println("cents2 = " + cents2);


        System.out.println("--------------------");
        
        int y = 300;
        
        y %= 16; // because we divide 300 with 16

        System.out.println("y = " + y);
        System.out.println("--------------------");
        
        int balance = 3500;   // insurance fee is  153
        
        balance %= 153;
        System.out.println("balance = " + balance);
        
        


        
        
        
    }
}
