package day45_Interface.shape;

public class Square extends Shape {

    private double side;

    public Square(String name, double side) {
        super(name);
        setSide(side); //constructor dan sonra this i set olarak degistiriyoruz ki sonradan set edegbilelim
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <=0 ){
            throw  new RuntimeException("Invalid");
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side*side;
    }

    @Override
    public double perimeter() {
        return side*4;
    }


    @Override
    public String toString() {
        return "Square{" +
                super.toString()+ //super classtaki toStrinleri cagirdik
                "side=" + side +
                '}';
    }
}
