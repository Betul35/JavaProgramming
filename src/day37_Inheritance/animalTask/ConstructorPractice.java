package day37_Inheritance.animalTask;

class A{
    public A(){ //burada arguman yok icinde, ondan by default..
        System.out.println("A");
    }
}

class B extends A{
    public  B(){
        //super() bu implicitly
        System.out.println("B");
    }
}


public class ConstructorPractice {

    public static void main(String[] args) {

        B obj = new B();


    }

}
