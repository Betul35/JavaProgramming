package day37_Inheritance.phoneTask;

public class Phone {

    public String brand, model;

    public double size;
    public double price;
    public String color;

    public static boolean hasBattery;

    public Phone(String brand, String model, double size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;
    }

    static {
        hasBattery = true;
    }

      public void call(long phoneNumber){
          System.out.println(brand + model + " is calling");
      }

      public void text(long phoneNumber){
          System.out.println(brand + model + " is texting " + phoneNumber);
      }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price= £" + price +
                ", color='" + color + '\'' +
                '}';
    }


}
