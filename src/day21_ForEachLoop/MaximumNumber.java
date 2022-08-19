package day21_ForEachLoop;

public class MaximumNumber {

    public static void main(String[] args) {
         int[] numbers = {10,47,389,574,28,4,423,0,87546};
         int max = numbers[0]; //assuming
         int min = numbers[0];

         for (int each :numbers){ //burayi vermek icin kisayol: numbers.for yaz hit the enter
             if (max < each){
                 max = each;
             }
             if (each<min){
                 min= each;
             }
         }
        System.out.println(max);
        System.out.println(min);




    }
}
