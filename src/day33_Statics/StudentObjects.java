package day33_Statics;

import java.util.Arrays;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student("Ahmet");
        System.out.println(student1); //Ahmet

        Student student2 = new Student("aygun", 'F');
        System.out.println(student2);

        Student student3 = new Student("Selen",'M',24);
        System.out.println(student3);


        Student[] students = {student1,student2,student3};
        System.out.println(Arrays.toString(students));









    }


}
