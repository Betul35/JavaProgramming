package day24_CustomMethodReturn;

public class ReturnMethodPractice {

    public static void main(String[] args) {

       int maxNumber = max(100,200); //tekrar kullanabilmek icin reassign yapiyoruz.

        System.out.println(maxNumber);

        int multiplication = maxNumber * 2;

        System.out.println(multiplication);


    }


// create a method that can return max number between two numbers
//find the max number between 100 & 200
//then multiply the max number by 2


    public static int max(int a, int b){

        int result = 0;

        if (a>b){
            result= a;
        }else {
            result = b;
        }

        return result;


    }




}







