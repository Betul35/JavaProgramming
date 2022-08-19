package day25_CustomMethod_Overloading;

public class SumOfNumbers {

    public static void main(String[] args) {

        int sum = sumOf2Numbers(10,20);
        System.out.println("sum "+ sum);

        System.out.println("---------------------------");

        int sum3num = sumOf3Numbers(13,45,78);
        System.out.println("sum3num = " + sum3num);

        System.out.println("---------------------------");

        int sum4Num = sumOf4Numbers(543,67,346,4336);
        System.out.println("sum4Num = " + sum4Num);

    }
     // 1. create a method that can find the sum of two numbers
                    // method name: sumOf2Numbers
    public static int sumOf2Numbers(int num1, int num2){

        return num1 + num2;
    }


    //2. create a method that can find the sum of three numbers
            //method name: sumOf3Numbers
    public static int sumOf3Numbers(int num1, int num2, int num3){

        return num1+num2+num3;
    }


 //3. create a method that can find the sum of four numbers
                //method name: sumOf4Numbers
    public static int sumOf4Numbers(int num1, int num2, int num3, int num4){

        return num1+num2+num3+num4;
    }


}

/*
Task1:
	    1. create a method that can find the sum of two numbers
	                    method name: sumOf2Numbers

	    2. create a method that can find the sum of three numbers
	                    method name: sumOf3Numbers

	    3. create a method that can find the sum of four numbers
	                    method name: sumOf4Numbers

 */
