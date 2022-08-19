package day30_CustomClasses;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int year;
    public int prize;

    public  void setInfo(String carBrand,String carModel,String carColor, int carYear,int carPrize){
        brand = carBrand;
        model = carModel;
        color = carColor;
        year = carYear;
        prize = carPrize;
    }

    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", prize= £" + prize +
                '}';
    }

    public void drive(){
        System.out.println(brand + " is driven");
    }
    public void start(){
        System.out.println(brand + " is driven");
    }
    public void stop(){
        System.out.println(brand + " can stop");
    }





}
