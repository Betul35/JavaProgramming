package day21_ForEachLoop;

public class ReverseNames {

    public static void main(String[] args) {

        String[] classMates = {"Safiyye Uyuyan","Aysegul Calisan","Gul Cokbilen","Ensar Canim","Busra Manik","Betul Kirpik","Talha Konuskan",
                "Ahmet Nadir","Serap Ticaretci","Joanne Bidibidi","Holly Sekersey","George Gulecyuz"};

        for (String every : classMates) { // every: every single names

            String reversed = ""; //tersinden yazacagiz yani, bunun icin last index numberdan baslamaliyiz every stringin,
                                    // bunun icin for each loop kullaNAMAYIZ, for loop kullanacagiz

            for (int i = every.length()-1; i >=0 ; i--) {
                reversed+=every.charAt(i);
            }
            System.out.println(reversed);

        }



        }
}
