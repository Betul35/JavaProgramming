package day43_Absrtaction.car;

public abstract class  Car {// this is parent class,m asaggida start a abstract deyince classa da demek lazim

    private final String brand, model;
    private String color;
    private final int year;
    private double price;


    public Car(String brand, String model, String color, int year, double price) {
        this.brand = brand;
        this.model = model;
        setColor(color);

        if(year < 1886 ){ //ilk arabanin ciktigi zaman :D
            throw new RuntimeException("Invalid year: " + year);
        }
        this.year = year;
       setPrice(price); ////constructor yaptiktan sonra setter yaptigimiz color ve price i set olarak degistiriyoruz
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }


    public void setColor(String color) {
        this.color = color;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public void stop(){
        System.out.println("Press the brake");
    }

    public abstract void start(); // child class ta start lar degisik implementation, yani body olacagi icin, abstract yapiyoruz by overriding


    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }


}
