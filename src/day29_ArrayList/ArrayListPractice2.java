package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {

    public static void main(String[] args) {
        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali","Ahmet", "Betul", "Serenat","Burce","Aaron","David" ));

        employees.retainAll(Arrays.asList("Ahmet","David")); //sadece ahmet ve david i tutup digerlerini removelayacak

        System.out.println(employees);

        System.out.println("----------------------------------");
        String[] names = {"Mary","Betul","Mehri","Joanne","Leyla","Hasan","Beril"};

        ArrayList<String> namesList = new ArrayList<>(Arrays.asList(names));
        namesList.removeIf(p-> p.startsWith("M")); //startsWith yerine charAt(0) == 'M' de yazabiliriz
        System.out.println(namesList);

        names = namesList.toArray(new String[0]);





    }

}
