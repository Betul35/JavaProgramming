package day27_WrapperClasses;

public class WrapperClassesIntro {

    public static void main(String[] args) {

        int num1 = 200;

        Integer n1 = num1;//autoboxing      // bunu wrap etmis oluyor, int primitive oldugundan
                                            // array hrici 2 methodda kullanilamaz, onda kullanmak icin
                                            // boyle bir yontem kullanmis oluyoruz

        int num2 = n1; // unboxing

        System.out.println("------------------------");

        Integer integerValue = 100;
        long longValue = integerValue; // wrapper classtan primitives e convert ederken aralik icindeyse her type sekilde convert edebiliriz.
                                        // ama primitives ten wrapper classa convert ederken kendi type i olmasi lazim

        System.out.println("------------------------");

        int num3 = 200; //Long l2 = num3; boyle ceviremeyiz
        Integer num4 = num3; // anca kendi cinsindeki wrappper classes a convert edebiliriz.

        System.out.println("------------------------");

        Integer z = 900;
        Integer y = z; //bu da wrapper class tan wrapper class a convert

        System.out.println("------------------------");



    }

}
