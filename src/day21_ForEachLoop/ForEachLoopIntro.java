package day21_ForEachLoop;

public class ForEachLoopIntro {

    public static void main(String[] args) {

       int[] numbers = {10,20,30,40,50,60,70};

        for (int i = 0; i < numbers.length; i++) {
            int eachElement = numbers[i];
            System.out.println(eachElement); // tum elementleri run yapmak icin
        }

        System.out.println("----------"); //simdi yukariyi for each loop la yapacagiz, more reasonable

        for (int each: numbers ){
            System.out.println(each); // kiiizzz bu cok basitmis yeeaaww
        }


    }
}
