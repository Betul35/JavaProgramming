package day37_Inheritance.phoneTask;

public class Iphone extends Phone {


    public Iphone (String brand, String model, double size, double price, String color) {
        super("Apple", model, size, price, color); //sadece brand i apple olarak initilise ediyoruz, cunku tum create oblect of iphonlarin hepsinin brandi ayni
    }

  public void faceTime(long phoneNumber){
      System.out.println(brand + phoneNumber + " is having face time");
  }

    public void faceTime(String email){
        System.out.println(brand + email + " is having face time");
    }


}
