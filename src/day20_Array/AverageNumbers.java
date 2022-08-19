package day20_Array;

public class AverageNumbers {

    public static void main(String[] args) {

        int[] numbers = {10,20,30,40,50,60};
        double sum = 0; //10+20+30+...

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i]; // burada teker teker hepsi birbirine ekleniyor, toplamasini bulmak icin ..
        }
        double averageNumbers = sum / numbers.length;

        System.out.println("averageNumbers = " + averageNumbers);






    }
}
