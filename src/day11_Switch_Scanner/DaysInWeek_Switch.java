package day11_Switch_Scanner;

public class DaysInWeek_Switch {

    public static void main(String[] args) {


        int number = 7;  //haftanin gunleri, normalde if kullaniyoruz, simdi switch kullancagiz.


        switch (number){ // 1,2,3,4,5,6,7 vericez value olarak

            case 1:
                System.out.println("Monday");
                break;// exits the switch after executing the case block

            case 2:
                System.out.println("Tuesday");
                break; // her defasinda break veriyoruz ki case leri ayiralim birbirinden, yoksa run yapinca ikisi birlikte cikar.

            case 3:
                System.out.println("Wednesday");
                break;

            case 4:
                System.out.println("Thursday");
                break;

            case 5:
                System.out.println("Friday");
                break;

            case 6:
                System.out.println("Saturday");
                break;

            case 7:
                System.out.println("Sunday");
                break;


            default: // genelde sonda konumlandiriyoruz, ama her yere koyulabilir.
                System.out.println("Invalid"); // hicbiri match olmuyorsa default kullaniyoruz.
                                              // yani if de else e denk geliyor.








        }




    }
}
