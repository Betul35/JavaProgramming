package day24_CustomMethodReturn;

public class Return_vs_ExitMethod {

    public static void main(String[] args) {

       nameOfMonths(55);

        System.out.println("Hello World"); //burada hello world yazilacak, cunku line 17 de sadece nameOfMonth method exit oluyor.
                                            // AMAAAA, line 18 e bak, eger line 18 i run larsak, Tum Sistem terminate olacagi icin
                                            // bu kod fragmani run olmayacak
    }


    public static void nameOfMonths(int number){

        if (number<1 || number>12){
            System.out.println("Invalid");
            return; //burada only nameOfMonth methodu exit yapiyoruz.
            //System.exit(0);
        }

        String name = (number==1)?"January":(number==2)? "February":(number==3)?"March":
                (number==4)?"April":(number==5)? "May":(number==6)?"June":
                        (number==7)?"July":(number==8)? "August":(number==9)?"September":
                                (number==10)?"October":(number==11)? "November":"December";



        System.out.println("Month name = " + name);
    }






}
