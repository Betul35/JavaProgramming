package day37_Inheritance.phoneTask;

public class Samsung extends Phone{


    public Samsung(String brand, String model, double size, double price, String color) {
        super(brand, model, size, price, color);
    }

    public void freeze(){
        System.out.println(brand + " is freezing");
    }
}
