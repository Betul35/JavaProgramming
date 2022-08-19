package day30_CustomClasses;

import java.util.ArrayList;

public class StudentObjects {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.setInfo("Aygun",'F',39,2210,'A');
        System.out.println(student1);

        Student student2 = new Student();
        student2.setInfo("Suat",'M',45,532,'C');
        System.out.println(student2);


        Student student3 = new Student();
        student3.setInfo("Sahika",'F',19,1310,'B');
        System.out.println(student3);


        Student student4 = new Student();
        student4.setInfo("Recep",'M',24,65,'A');
        System.out.println(student4);


        Student student5 = new Student();
        student5.setInfo("Zehra",'F',34,65530,'F');
        System.out.println(student5);


        Student[] students ={student1,student2,student3,student4,student5};

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("-----------------------------------------------------");

        ArrayList<Student> earlyBirds = new ArrayList<>(); //grade:A
        ArrayList<Student> angryBirds = new ArrayList<>(); //grade: not A


        for (Student each : students) {
            if (each.grade=='A'){
                earlyBirds.add(each);
            }else{
                angryBirds.add(each);
            }
        }
        System.out.println("earlyBirds = " + earlyBirds);
        System.out.println("angryBirds = " + angryBirds);


    }

}
