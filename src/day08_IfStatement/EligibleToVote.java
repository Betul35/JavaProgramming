package day08_IfStatement;

public class EligibleToVote {

    public static void main(String[] args) {

        String name= "Josh";
        String citizen = "USA";
        int age = 38;

        // eligible
        boolean isEligible = age>=21 && citizen == "USA"; // %% says ayni zamanda ... iki degiskeni de saglamali, ve

       if(isEligible){
           System.out.println(name + "Eligible");
       }

        //not eligible, bunlar possibilities ler
        if(!isEligible){
            System.out.println("Not Eligible");

        }




    }
}
