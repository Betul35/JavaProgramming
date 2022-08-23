package day38_Inheritance.carTask;

public class Toyota extends Car {


    public Toyota( String model, int year, double price, String color, int miles) {
        super("Toyota", model, year, price, color, miles);
    }

    public void reliable(){
        System.out.println(brand + model + " is reliable");
    }

    public void start(){ // start methodunu burada overriding yapmis oluyoruz, yani method ayni ama tum araclarda start methodu degisik bir sekilde uygulaniyor demek
        System.out.println(" Twist the key to ignition the car" + model);
    }


}
