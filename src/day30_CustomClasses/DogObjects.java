package day30_CustomClasses;

public class DogObjects {

    public static void main(String[] args) {

      Dog dog1 = new Dog(); //datatype needs to be Dog, not String not int etc! this is object of dog

        dog1.name = "Lucy"; //we are declareing them as instance variables
        dog1.breed = "Husky";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "White";

        System.out.println(dog1);

        Dog dog2 = new Dog();

        dog2.name = "Ace";
        dog2.breed = "Husky";
        dog2.age = 5;
        dog2.gender = 'M';
        dog2.size = "Large";
        dog2.color = "White & Black";

        System.out.println(dog2);

        Dog dog3 = new Dog();
        dog3.setInfo("Jack", "German Shepard", 2, 'M', "Large", "Black");
        System.out.println(dog3);


        dog1.eat();
        dog2.bark();

    }

}
