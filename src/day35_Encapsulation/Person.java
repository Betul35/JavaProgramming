package day35_Encapsulation;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWing, numberOfHead;

    public Person(String name, int age, char gender, String language) { //setting the constructor
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
    }

    static { // setting static
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWing = 0;
        numberOfHead = 1;
    }

    public static void printPlanetName(){ //static yapiyoruz cunku planet static, instance olsa we have to call through the class name, bu da takes more memory
        System.out.println("Planet name is " + planet);
    }

    public void eat(String food){ //this is instance method
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink){ //this is instance method
        System.out.println(name+ " is drink " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                ",planet='" + planet + '\'' +
                '}';
    }
}
/*
warmup tasks:
	1. Create a class named Person:
			Variables:
				name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

			Add a constructor to initialize all the fields

			Add a static block to initialize all the statics

			Methods:
				printPlanetName()
				eat(String food)
				drink(String drink)
				toString()
 */
