package day16_ForLoopStringPractices;

public class Reverse {

    public static void main(String[] args) {
         String str = "Wooden Spoon";

         String result = ""; // contain the reversed version of str, reverse means tersten okuma
        // noopS nedooW
        // bunu tersdten yazabilmek icin bizim ilk lenght numarasini bilmemiz lazim, last index de lenght-1 olmus oluyor,
        // sondaki harfin indexinden 0 a kadar, birbirine ekleyerek loops ile yazdirabiliriz. boylece elde etmis oluruz.
        // ama ilk once uzun yolu gosterelim ki anlasilsin.

        /*
        result += str.charAt(11);
        result += str.charAt(10);
        result += str.charAt(9);
        result += str.charAt(8);
        result += str.charAt(7);
        result += str.charAt(6);
        result += str.charAt(5);
        result += str.charAt(4);
        result += str.charAt(3);
        result += str.charAt(2);
        result += str.charAt(1);
        result += str.charAt(0);
        */

        for (int i = str.length()-1; i>=0; i--){ // i= index number of str, starts from 0 ve 11 de bitiyor.
            result += str.charAt(i); // bunu da ekliyoruz birbirine ki beraber yazilsin
        }
        System.out.println(result);










    }
}
/*

	1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW


 */