package day11_Switch_Scanner;

public class NumberOfDays_Switch {

    public static void main(String[] args) {

        int number = 9;
        int year = 2000;

        if(number>=1 && number<=12){

            switch (number){

                case 2:

                    if( year %4 ==0){  // hatta buraya ekstra leap year ayrintisini da ekleyebiliriz.
                        System.out.println("29 Days");
                    }else {
                        System.out.println("28 Days");
                    } // ayni zamanda bunu ternaries olarak da yazabiliriz
                    break;

                 case 4 : case 6 : case 9 : case 11:
                    System.out.println("30 Days");
                    break;

                default:  // burda bunu otherwise gibi kullaniyoruz
                    System.out.println("31 Days");

            }



        }else {
            System.out.println("Invalid");
        }





    }
}

    /*
            number of days
            28 days :2
            30 days : 4,6,9,11
            31 days : 1,3,5,7,8,10,12
    */
