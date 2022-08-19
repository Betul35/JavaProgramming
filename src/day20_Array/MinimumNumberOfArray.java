package day20_Array;

public class MinimumNumberOfArray {

    public static void main(String[] args) {
        int[] numbers = {67,34,87,0,2,-1,980};
        int min = numbers[0];

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i]< min ){
                min = numbers[i];
            }

        }
        System.out.println(min);




    }
}
