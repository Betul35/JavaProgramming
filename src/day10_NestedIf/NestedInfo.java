package day10_NestedIf;

public class NestedInfo {

    public static void main(String[] args) {

        int score = 95;

        if (score >= 0 && score <= 100) { // this is a precondition, if the score is valid


            if (score >= 60) {// if student passed the exam
                System.out.println("Passed");
            } else { // if student failed exam
                System.out.println("Failed");
            }

        } else {
            System.out.println("Invalid");
        }
        //if the score is not valid

            System.out.println("-------------------------------------");

            // to buy alcohol, first need an Id, then check the age

            int age = 27;

            boolean hasId = false;

            if (hasId) {

                if (age >= 16) {
                    System.out.println("can buy alcohol");
                } else {
                        System.out.println("can Not buy alcohol");
                    }


                }else {
                System.out.println("you have to have an ID first ciniiimm(invalid)");
            }
            }
    }
