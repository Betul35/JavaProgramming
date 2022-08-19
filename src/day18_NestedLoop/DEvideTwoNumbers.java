package day18_NestedLoop;

public class DEvideTwoNumbers {

    public static void main(String[] args) {
        int a= 20;
        int b=6;

        int count= 0;
        while (a>=b){
            a-=b;
            count++;

        }
        System.out.println(count);
        System.out.println("Remainder is: "+ a);



    }
}
/*
1.  Write a program that can divide two positive numbers without using /
(division) and * (multiplication) and % operators
a= 20 b = 6
20-6= 14
14-6=8
8-6=2 yontemini kullanabiliriz
a-=b

while(a>=b)  a b den kucuk olunca duracak yazdirmayi


 */
