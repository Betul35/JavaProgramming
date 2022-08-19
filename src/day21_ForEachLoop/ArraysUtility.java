package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {

    public static void main(String[] args) {

        int[] nums = {1,2,3,4,5};
        System.out.println(Arrays.toString(nums));
        System.out.println(nums[0]); //burada toString e convert yapmamiz gerekmiyor, cunku arrayi degil arrayin icindeki int elementini yazdiriyoruz

        System.out.println("-------------------------------------");
        //sort method : it is goint to sort the array in ascending order
        // ascending order: 0-9 , yani smallest to largest, or a to z A to Z

        int[] scores = {95,100,55,90,65,78};
        Arrays.sort(scores); // burada Arrayi sort etmis, yani kucukten buyuge order yapmis oluyoruz, sonra da toString le tum arrayi yazdiracagiz
        System.out.println(Arrays.toString(scores));

        System.out.println("Minimum score = " + scores[0]);
        System.out.println("Maximum score = " + scores[scores.length-1]);

        System.out.println("----------------------------");

        String[] names= {"Gunay", "Anna","Zuhal","Ahmet","Betul","Serap","Maria"};
        Arrays.sort(names);
        System.out.println(Arrays.toString(names));

        String[] isim = {"Anna","ANNA"};
        Arrays.sort(isim);
        System.out.println(Arrays.toString(isim));

        System.out.println("----------------------------");
        //equal method

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,3,2};
        boolean r1 = Arrays.equals(arr1,arr2); //bizi true false cevirecegi icin boolean olan assign ediyoruz
        System.out.println(r1);

        //ama bunlari ilk sort yaparsak, order olacaklari icin esit olacaklar

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println(r2);

        System.out.println("-----------------------------");
        // "acb" , "bac" bunlar esit degiller ama enegram lar enegram means earth heart gibi listen silent

        char[] ch1 = {'a', 'b', 'c'};
        char[] ch2 = {'b', 'a', 'c'}; // simdi bunlarin enegram olup olmadigina bakacagiz, interview da cok cikiyor

        Arrays.sort(ch1);
        Arrays.sort(ch2);
        // bunlari sort yapip esit mi diye bakarsak enegram olup olmadigini anlayabiliriz
        boolean anagram = Arrays.equals(ch1,ch2); //sonra da esitler mi diye bakiyoruz, return boolean
        System.out.println(anagram);






    }
}
