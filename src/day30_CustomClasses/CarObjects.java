package day30_CustomClasses;

import java.util.ArrayList;
import java.util.Arrays;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();

        car1.setInfo("Toyota","Camyr","carColor", 2019, 3500);

        System.out.println(car1);

        Car car2 = new Car();
        car2.setInfo("Volvo", "V40","Blue", 2021, 17000);
        System.out.println(car2);

        Car car3 = new Car();
        car3.setInfo("Ford", "Focus","red",2013,2000);
        System.out.println(car3);

        //simdi array create yapicaz ki bunlari store lamak icin

        // Car[] cars = {car1, car2,car3}; buy car array ama arrayList more convenience ondan onu create edelim

        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(car1,car2,car3));

        for ( Car each : carsList) {
            System.out.println(each.brand + ": " + each.prize);
        }


        System.out.println("--------------------------------------------------------");

            /*
                Volvo: 2005~2008
                Toyota: 1995~1997
             */
        carsList.removeIf(p-> p.brand.equals("Volvo")&& p.year>=2005 &&p.year<=2008);
        carsList.removeIf(p-> p.brand.equals("Toyota") && p.year>=1995 && p.year<=1997);




        }

    }


