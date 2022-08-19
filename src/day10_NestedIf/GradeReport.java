package day10_NestedIf;

public class GradeReport {
    public static void main(String[] args) {

        /*
        90~100: excellent
        80~89: Great
        70~79: Good
        60~69: Passed
        0~59: Failed
         */

        int score= 76;

        boolean getTest= false;


        if (getTest==true){

            if (score>=90 && score<= 100){
                System.out.println("excellent");
            } else if (score>=80 ) {
                System.out.println("great");
            } else if (score>=70 ) {
                System.out.println("Good");
            } else if (score>=60) {
                System.out.println("passed");
            }else {
                System.out.println("you failed cinim,git bidaaa calis");
            }


        }else {
            System.out.println("sen zaten Failed hajiimm");
        }


/*
 ooor you can use String like;

 String result = "";
 sonra da iflerin altina System... print statement yazmadan result = "Great" gibi yazabilirsin.
 */

    }
}
