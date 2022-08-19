package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

       // oddOrEvenNumber(); // the demands additional info to complete its task

        oddOrEvenNumber(10);

        System.out.println("--------------");

        ageOfPerson(1957);

        System.out.println("--------------");

        printNumbers(10,50);


    }

        //create a function that can check if a number even or odd number
        public static void oddOrEvenNumber(int number){ //10

            if (number%2 ==0){
                System.out.println(number + " is even number");
            }else{
                System.out.println(number + " is odd number");
            }
        }



        //create a function that can display the age of the person
    public static void ageOfPerson(int birthYear){

        int age = 2021 - birthYear;
        System.out.println("Your age is " + age);
    }



                                                         //   10    50
    //create a function that can print all the numbers between X and Y
    public static void printNumbers(int x, int y){
        for (int i = x; i < y+1; i++) {
            System.out.println(i);
        }
    }


    }

