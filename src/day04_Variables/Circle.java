package day04_Variables;

public class Circle {
    public static void main(String[] args) {
        //PI, radius, diameter, area, perimeter
        // diameter is cap, radius is yaricap
        double radius = 10;

        double PI = 3.14;
        double diameter = 2 * radius;
        double area = radius * radius * PI;
        double perimeter = diameter * PI;

        System.out.println("radius = " + radius);
        System.out.println("diameter = " + diameter);
        System.out.println("area = " + area);
        System.out.println("perimeter = " + perimeter);



    }



}
