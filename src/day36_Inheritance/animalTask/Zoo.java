package day36_Inheritance.animalTask;


public class Zoo {

    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.setInfo("Max","Husky",'M',2, "Small","orange");
        
        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        dog.bark();
        
        
        Cat cat = new Cat();
        cat.setInfo("Duman","British",'F',4,"large","Kul Rengi");

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.scratch();
        
    }
}
