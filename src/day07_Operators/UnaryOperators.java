package day07_Operators;

public class UnaryOperators {

    public static void main(String[] args) {

        int num= +25; // unary plus operator
        int num2 = -17;  // unary negative operator

        System.out.println("----------------------------");
        int a = 5;
        ++a; // it is pre increment; increase the value by 1 right away

        System.out.println(a);

        --a; // pre decrement; decrease de value by 1 immediately
        System.out.println(a);
        System.out.println("-----------------------------");

        int c= 100;
        System.out.println(c++); // post increment: it is going to increase in the next step
        System.out.println(c); // 101

        System.out.println("-----------------------------");
        int x = 200;
        System.out.println(--x); // 199

        int y = 200;
        System.out.println(y--); // past decrement
        System.out.println(y);
        System.out.println("-----------------------------");

        int z = 45;
        System.out.println(++z); // 46
        System.out.println(z++); //46
        System.out.println(z); //47
        System.out.println("-----------------------------");

        int q = 30;

        System.out.println(--q); // 29
        System.out.println(q--);// 29
        System.out.println(q); //28





    }
}
