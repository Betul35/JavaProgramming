package day32_Constructor;

public class ConstructorCalls {

    public ConstructorCalls(){
        // this(); Rule5. constructor can not call itself
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a){
        this(); //rule 3. constructor call has to be at first step
        System.out.println("Constructor with int argument");
    }

    public ConstructorCalls(String str){
        //this();
        this(10); // rule . constructor call has to be only one time
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {
        ConstructorCalls obj1 = new ConstructorCalls();

        System.out.println("-------------------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);

        System.out.println("-------------------------------------");

        ConstructorCalls obj3 = new ConstructorCalls("Java");

    }



}
