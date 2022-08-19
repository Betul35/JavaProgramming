package day24_CustomMethodReturn;

public class WarmUpTasks {

    public static void main(String[] args) {

        initials("Wooden", "Spoon");// W.S

        System.out.println("-----------------");

        domain("betulpiyade@gmail.com");

        System.out.println("-----------------");

        String[] emails = {"betulpiyade@gmail.com", "hadibaalim@amazon.com", "sanane@yahoo.com"};
        for (String email : emails) { //burada bir suru Stringimiz var array olarak, ilk each elementi arraydan cikarip
            domain(email);            // void methodda olusturdugumuz domaini uygulayacagiz.
        }

        System.out.println("----------------------------");

        nameOfMonths(9);



    }

 //1. Create a method that can display the initials of the person ==> initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName){
       String initial = firstName.charAt(0)+ "."+ lastName.charAt(0);
       initial = initial.toUpperCase();// user kucuk harf kullandiysa uppercase olsun deyu
        System.out.println(initial);
    }


 // 2. Create a method that can display the domain of the email ==> domain(String email)
    public static void domain(String email){ //cydeo@gmail.com olsun mesela
    String domain = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain is = " + domain);

    }



//3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonths(int number){
        String name = ""; // I have 12 options

        if (number>=1 && number<=12){

            name = (number==1)?"January":(number==2)? "February":(number==3)?"March":
                   (number==4)?"April":(number==5)? "May":(number==6)?"June":
                   (number==7)?"July":(number==8)? "August":(number==9)?"September":
                   (number==10)?"October":(number==11)? "November":"December";


        }else {
            name = "Invalid";
        }
        System.out.println("Month name = " + name);
    }



//4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){

    }



}



/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has


 */