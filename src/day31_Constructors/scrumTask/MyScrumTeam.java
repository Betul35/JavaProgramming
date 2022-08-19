package day31_Constructors.scrumTask;

public class MyScrumTeam {

    public static void main(String[] args) {

        //4 testers objects
        Tester tester1 = new Tester("Betul", 1593,"Senior SDET", 93000);
        Tester tester2 = new Tester("Sayan", 134,"QA", 91000);
        Tester tester3 = new Tester("Alex", 42524,"QA", 45000);
        Tester tester4 = new Tester("Betul", 54253,"SDET", 76000);

        Tester[] testers = {tester2,tester3,tester4};


        //5 developers objects

        Developer developer1 = new Developer("Alex",3523,"Java Developer",10000);
        Developer developer2 = new Developer("Olga",55432,"Java Master",67000);
        Developer developer3 = new Developer("Alex",213,"Software Developer",75000);
        Developer developer4 = new Developer("Ayse",6747,"Senior Developer",10000);
        Developer developer5 = new Developer("Sumeyye",463424,"Java Developer",12000);

        Developer[] developers = {developer2,developer3,developer4,developer5};

        //1 scrum team object

        ScrumTeam scrum = new ScrumTeam("Nigara","Huseyin","Neira",14);
        scrum.addTester(tester1); //adding 1
        scrum.addDeveloper(developer1);

        scrum.addTesters(testers); //adding 3, total olarak 4 olacak testerlar
        scrum.addDevelopers(developers);
        System.out.println(scrum);

        System.out.println("---------------------------------------------------------");

        for ( Tester eachTester : scrum.testersList) {// burada scrum team deki testerlarin ismini ogrenmeye calisiyoruz
            System.out.println(eachTester.name + " : " + eachTester.salary);
        }

        System.out.println("---------------------------------------------------------");

        for (Developer eachDeveloper : scrum.devopsList){
            System.out.println(eachDeveloper.name + " : " +eachDeveloper.salary);
        }

        System.out.println("---------------------------------------------------------");

        scrum.removeTester(54253);
        scrum.removeDeveloper(3523);
        System.out.println(scrum);







    }


}
/*
        create a class called MyScrumTeam:
	                 1. create an array of Testers and add the testers from your group
	                 2. create an array of developers add the developers from your group
	                  3. create an object of ScrumTeam and store the testers & developers above to the scrum team
 */
