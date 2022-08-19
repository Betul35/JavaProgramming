package day21_ForEachLoop;

public class AverageNumber {

    public static void main(String[] args) {

        int[] numbers = {3,65,22,870,80,543,100,45}; //bunlarin ortalamsini alacagiz
         double sum = 0;

        for (int number : numbers) {
           sum += number;
        }
        double average = sum/ numbers.length;
        System.out.println(average);



    }
}
