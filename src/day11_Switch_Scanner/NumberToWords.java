package day11_Switch_Scanner;

public class NumberToWords {

    public static void main(String[] args) {

       int number = -7;

       if (number>=0 && number<=9){

           String result = (number==0)? "Zero" : (number==1)? "one" : (number==2)? "two" : (number==3)? "three" :
                   (number==4)? "Four" : (number==5)? "Five" : (number==6)? "six" : (number==7)? "seven" :
                           (number==8)? "Eight" : "nine";

           System.out.println(result);

       }else{
           System.out.println("Invalid Number");
       }







    }
}
/*
Write a program that can convert numbers 0~9 to words.

		NOTE: MUST use ternary
 */
