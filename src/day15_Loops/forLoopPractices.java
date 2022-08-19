package day15_Loops;

public class forLoopPractices {

    public static void main(String[] args) {

        //15 16 17 ....45

       for ( int i = 15; i<=45; i+=1) {
           System.out.print(i + " ");// burada printl yapmiyoruz, print yapiyoruz ki ayni line da olsunlar
       }
       System.out.println(); //buraya bu run i vermzsem asagida run yaptigim Hello 45 in yaninda run olacak
           System.out.println("Hello");

        System.out.println("--------------------------------------");

       // 100 99 98.........50

        for (int i = 100; i >49; i--){
            System.out.print(i + " ");
        }
        System.out.println("\n" +"Selamun aleykum agalar");

        System.out.println("----------------------------");
        //print even numbers between 1~55 2 ile bolunebilen

        for (int i = 1; i<=55; i++){
           if (i%2 ==0){
               System.out.print(i+ " ");
           }
        }
        System.out.println();
        System.out.println("------------ya da soyle bir solution var---------");

        for (int i = 2; i<=54; i+=2){
            System.out.print(i + " ");
        }






    }
}
