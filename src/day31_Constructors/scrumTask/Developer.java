package day31_Constructors.scrumTask;

public class Developer {

    public String name;
    public int employeeID;
    public String jobTitle;
    public double salary;

    public Developer(String name, int employeeID, String jobTitle, double salary) {
        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary= £" + salary +
                '}';

    }


    public void smokeTesting(){
        System.out.println(name + "is smoke testing");
    }

    public void creatingTicket(){
        System.out.println(name + " is cresting the ticket");
    }







}
/*
create a class called Developer
	          Attributes:
	            name, employeeID, JobTitle, Salary

	          Add A constructor that can set all the fields

	          Actions:
	            coding(), unitTesting(), fixingBug(), toString()
 */
