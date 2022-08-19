package day12_Scanner;

public class GradeLevel {

    public static void main(String[] args) {

        byte number = 14;
        boolean grade = number>=1 && number<=18;


        if (grade){

            switch (number){

                case 6: case 7: case 8:
                    System.out.println("Middle School");
                    break;

                case 9: case 10: case 11: case 12:
                    System.out.println("High School");
                    break;

                case 13: case 14: case 15: case 16:
                    System.out.println("College");
                    break;

                case 17: case 18:
                    System.out.println("Grad School");
                    break;


                default:
                    System.out.println("Elementary School"); // for 1,2,3,4,5





            }
        }else {
            System.out.println("Invalid");
        }




    }
}
/*
warmup tasks:
    1. Create a class called GradeLevel,
    Given a number(byte) grade level determine and print which school type someone is in.
                 grade level and types are:
                        1-5: Elementary school
                        6-8: Middle school
                        9-12: High school
                        13-16: College
                        17-18: Grad School

                        For Any Other grade: Invalid grade level given

                Note:
                    Solution 1: Use switch statement
                    Solution 2: use if & switch both



 */
