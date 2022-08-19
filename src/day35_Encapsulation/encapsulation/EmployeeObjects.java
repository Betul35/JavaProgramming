package day35_Encapsulation.encapsulation;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tutti", 'F', 28, 120000);

        System.out.println(employee1);


        employee1.setAge(32);
        System.out.println(employee1);

        Employee employee2 = new Employee("",'H',360,-1299);
        System.out.println(employee2);

    }

}
