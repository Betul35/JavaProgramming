package day39_Recap.shapeTask;

public class Shape {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name==null){
            System.err.println("Name can not be null");
            System.exit(1);
        }

        if (name.isEmpty() || name.isBlank()){
            System.err.println("invalid name");
            System.exit(1);
        }
        this.name = name;
    }

    public Shape(String name) { //constructor yapiyoruz ama this key wordu setName ile degistiriyoeruz
        setName(name);
    }


    public double area(){
        return  0;
    }

    public double perimeter(){
        return 0;
    }

    @Override //toStringde bile override ediyoruz
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                "area='" + area() + '\'' +
                "perimeter='" + perimeter() + '\'' +
                '}';
    }
}
/*
Shape:
	variables:
			name

	Encapsulate the field

	Add a constructor to set the filed

	Methods:
		area(){}
		perimeter(){}


 */
