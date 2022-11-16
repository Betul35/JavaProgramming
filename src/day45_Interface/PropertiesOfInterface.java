package day45_Interface;

public interface PropertiesOfInterface {

    int a=100;
    static int b=200;

    /*public PropertiesOfInterface(int a){
        this.a = a;
    }

    static{
        b=100;
    } bu methodlarda body var ama interface bir class olmadigi icin body olmaz onda
    */


   //   public void method1(){
    //      System.out.println("Instance Method ");
   //       } bu da instnce oldugu icin interface de initialise yapamayiz, interface cannot have instance method

    public static void method2(){
        System.out.println("Static Method");
    }

    public abstract void method3();

    public default void method(){ //burada default keyword unu veriyoruz, cunku interface de body olmaz, body verebilmek icin default yaziyoruz
        System.out.println("Default method");
    }



}
