package day08_IfStatement;

public class LogicalOperatorsitwasinday7 {

    public static void main(String[] args) {

       // logical and

        String name = "Steven";
       int age= 19;
       String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA"; // && this is analogical, both
        //                   19>= 18 && "Uk" == "USA"
        //                      true && false = false

        System.out.println(name + " is eligible for vote: " + isEligible);

        System.out.println("---------------------------------");


        // apply for a loan

        String name2 = "Betul";
        int creditScore= 720;
        int age2 = 29;
        int income = 40000;

        boolean eligibleForLoan= creditScore>= 700 && age2 >= 20 && income<35000;
        System.out.println(name2 + " is eligible for a loan: " + eligibleForLoan );


        System.out.println("---------------------------------");

        //logical or operator ||

        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender == 'F' ); // might be eligible

        System.out.println(name3 + " is eligible for register " + isEligible3);



        System.out.println("---------------------------------");

        // become citizen

        String name4 = "Andrea";
        String countryOfBirth = "UK";
        boolean marriedToUsCitizen = true;

        boolean eligibleForCitizen = countryOfBirth == "USA" || marriedToUsCitizen == true;

        System.out.println(name4 + " is eligible to apply US citizenShip: " + eligibleForCitizen);

        System.out.println("---------------------------------");

        //scolarship

        String student = "Anna";

        double gpa = 3.5;
        int familyIncome = 100000;

        boolean eligibleForScholarship = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(student + " is eligible for scholarship: " + eligibleForScholarship);

        System.out.println("---------------------------------");

        boolean result2 = true;
        boolean result3 = !result2; // this is ! the opposite of the result2
        System.out.println("result3 = " + result3);

        System.out.println("---------------------------------");


        int score = 85;
        boolean passed= score >=60;
        boolean failed = !passed;
        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);







    }


}
