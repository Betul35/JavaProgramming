package day43_Absrtaction.car;

public class CarShop {

    public static void main(String[] args) {

      //  Car car1 = new  Car("Cydeo", "EU9", "blue",2022,10000); we cannot create object from Abstract class,
        //  because abscract class is not concrete, yani somut degil, ama child class taki objecti create yapabiliriz


        Honda honda = new Honda("Honda","Jazz", "Dark Blue",2017,7000);
        System.out.println(honda);



    }




}
