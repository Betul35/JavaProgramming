package day45_Interface.shape;

public abstract class Shape {

    private final  String name;


    public Shape(String name) { // burada constructor ile initialise ettik, final keywordunu verdigimiz zaman have to initialise right away
        this.name = getClass().getSimpleName(); //getSimpleName returns as what the class name is
    }

    public String getName() {
        return name;
    }

    public abstract double area();

    public abstract double perimeter();


    @Override
    public String toString() {
        return getClass().getSimpleName()+ "{" +
                "name='" + name + '\'' +
                " , area='" + area() + '\'' +
                " , perimeter='" + perimeter() + '\'' +
                '}';
    }
}
