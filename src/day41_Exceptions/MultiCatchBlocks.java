package day41_Exceptions;

import day35_Encapsulation.encapsulation.Employee;

public class MultiCatchBlocks {

    public static void main(String[] args) {

        Employee employee = null;

        try {
            System.out.println(employee.getSalary());
        }catch (IndexOutOfBoundsException e){
            System.out.println("First catch block");
            e.printStackTrace();
        }catch (ArithmeticException e){
            System.out.println("Second catch block");
        }catch (NullPointerException e){
            System.out.println("Third catch block"); //sanki sey gibi, nbu insanlar baligi yakalamaya  calisiyorlar, 3. yakaladi
                                                    // eger o da olmasaydi en sonuna parent class i yani RuntimeExceptioni veririz
        }

        System.out.println("Tested Completed");




    }

}
