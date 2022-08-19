package day10_NestedIf;

public class TernariesWithNestedIf {


    public static void main(String[] args) {

       int s = 85;

       if (s>=0 && s<=100){

           if(s>=60){
               System.out.println("Passed");
           }else {
               System.out.println("Failed");
           }
       }else {
           System.out.println("Invalid Score");
       }



       System.out.println("-------------------------------------"); // veya lets use ternaries


        String score = (s>=0 && s<=100)? (s>=60)? "Passed" : "Failed" : "Invalid Score";
        System.out.println(score);

// it is hard to read this ternaries in the nested is, recomendation is do not use ternanies in nested


        System.out.println("---------------------------------------");


    }
}
