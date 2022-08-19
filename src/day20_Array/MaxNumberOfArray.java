package day20_Array;

public class MaxNumberOfArray {

    public static void main(String[] args) {

        int[] numbers = {10,5,4,20,1,0};
        int max = numbers[0]; //10   // burada farzediyoruz ki ilk element max number,
                                    // sonrasinda loop u kullanarak bu elementi diger tum elementlerle karsilastirip
                                    // max numberi bulacagiz

        for (int i = 0; i < numbers.length; i++) { //kisayolu numbers.fori yazip hit the enter, sondan baslayacaksan da numbers.forr yaz

            if (numbers[i] > max ){ // if there is element in array that's greater that the max number
                max = numbers[i];

            }
        }

        System.out.println(max);


    }
}
