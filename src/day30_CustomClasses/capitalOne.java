package day30_CustomClasses;

public class capitalOne {

    public static void main(String[] args) {

        Employee employee1 = new Employee();
        Employee employee2 = new Employee();
        Employee employee3 = new Employee();
        Employee employee4 = new Employee();
        Employee employee5 = new Employee();

        employee1.setInfo("John",3245,'M',23,"Developer",100000,true);
        employee2.setInfo("Adita",465,'F',41,"Psychologist",80000,false);
        employee3.setInfo("Mark",2346,'M',46,"Developer",50000,false);
        employee4.setInfo("Betul",9879,'F',31,"QA",70000,true);
        employee5.setInfo("Sevgul",74556,'F',56,"Priminister",120000,true);

        Employee[] employees = {employee1,employee2,employee3,employee4,employee5};
        int countFullTime = 0;
        int countPartTime = 0;
        double max = employees[0].salary;
        double min = employees[0].salary;

        for (Employee employee : employees) {
            if (employee.isFullTime){
                countFullTime++;
            }else{
                countPartTime++;
            }

            if (employee.salary>max){
                max = employee.salary;
            }

            if (employee.salary<min){
                min = employee.salary;
            }

        }

        System.out.println("countFullTime = " + countFullTime);
        System.out.println("countPartTime = " + countPartTime);
        System.out.println("max = " + max);
        System.out.println("min = " + min);


    }

}
