package day44_Abstraction.animalTask;

public class Cat extends Animal implements WildAnimal{

    public Cat(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println(getName() + " eats chocolate");
    }

    public void meow(){
        System.out.println( getName() + " is meowing");
    }


    @Override
    public void hunt() {
        System.out.println(getName() + " goruyon mu cat hunt yapiii ");
    }
}
