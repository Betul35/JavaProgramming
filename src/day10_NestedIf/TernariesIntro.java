package day10_NestedIf;

public class TernariesIntro {

    public static void main(String[] args) {

        int n = 100;

        if(n%2 == 0){
            System.out.println("Even"); //String
        }else {
            System.out.println("Odd"); // String, yani stringe gonuyor ru yaptigimiz zaman
        }

        System.out.println("-----------------------------------------"); // or Ternaries ile shortcut i var bu if statemintin


        String result1 = (n%2==0)? "Even" : "Odd";
        System.out.println(result1);


        System.out.println("--------------------------------------------"); // bir ornek daha;

        int age = 18;

        if(age>=21){
            System.out.println("Eligible for alcohol");
        }else {
            System.out.println("Az daha bekle cinim zikkimlanmak icin");
        }
        System.out.println("------------------------"); // ya da ternaries ile soyle yapiyoruz; String kullaniyoz cunku Stringe donuyor

        String result2 = (age>=21)? "Eligible for alcohol" : "Az daha bekle cinim zikkimlanmak icin";
        System.out.println(result2);

        //ya da bir yol daha var
        System.out.println((age>=21)? "Eligible for alcohol" : "Az daha bekle cinim zikkimlanmak icin");


        System.out.println("----------------------------------------------"); //simdi else if yapalim;

        int number = 100;

       /*
        if (number>0){

            System.out.println("Positive");
        } else if (number<0) {
            System.out.println("Negative");
        }else {
            System.out.println("Zero");
        }
        */ // bu benim if statement acik yazilisi, bunu soyle yaziyoruz Ternaries ile, cunku 3 variable da Stringe donuyor;

        String result3 = (number>0)? "Positive" : (number<0)? "Negative" : "Zero";
        System.out.println(result3);



    }
}
