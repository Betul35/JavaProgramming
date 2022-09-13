package day43_Absrtaction.car;

public class Honda extends Car { //parent olan car class i abstract yaptigimiz icin, bu child class i extend
                                // yaptigimiz zaman compiler error alacagiz, ama asagida, parent classta
                                // hangi methodu abstract yaptiysak onu overriding yaptiktan sonra error gidecek

    public Honda(String brand, String model, String color, int year, double price) {
        super(brand, model, color, year, price);
    }

    public void start(){
        System.out.println("Twist the key to ignition");
    }




}
