package day39_Recap.shapeTask;

public class ShapeObject {

    public static void main(String[] args) {

        Square square = new Square(10);

        System.out.println(square);

        // square.side = 1000; error veriri cunku side private oldugundan direk kullanilamaz
        square.setSide(15);
        System.out.println(square);

        System.out.println("------------------------");

        Rectangle rectangle = new Rectangle(13,10);
        System.out.println(rectangle);


    }

}
