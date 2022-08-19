package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
      String firstName = "Betul";
      String lastName = "Piyade";
      int age = 45;
      String jobTittle = "SDET";
      String companyName = "Apple Inc";
      String fullName = firstName + " " + lastName;

        System.out.println(fullName);
        // Full name of the person is.....

        System.out.println("Full name of the person is " + fullName + "." );
        // .... is ... years old.

        System.out.println(fullName + " is " + age + " years old." );

        //FullName is JobTitle +at+ CompanyName

        System.out.println( fullName + " is " + jobTittle + " at " + companyName +".");



    }


}
