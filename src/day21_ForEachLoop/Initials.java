package day21_ForEachLoop;

import java.util.Arrays;

public class Initials {

    public static void main(String[] args) {

        String[] classMates = {"Safiyye Uyuyan","Aysegul Calisan","Gul Cokbilen","Ensar Canim","Busra Manik","Betul Kirpik","Talha Konuskan",
                "Ahmet Nadir","Serap Ticaretci","Joanne Bidibidi","Holly Sekersey","George Gulecyuz"};

        for (String each : classMates){
            String initial = each.charAt(0)+ "."+ each.charAt(each.indexOf(" ")+1 );

            System.out.println(initial);





        }



    }
}
