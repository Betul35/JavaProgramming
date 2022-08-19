package day13_String;

public class StringMethods {

    public static void main(String[] args) {

        String word = "Cydeo";

        char thirdChar = word.charAt(2); // ucunk=cu karakteri bulmak icin index 2 kodlamam lazim, cunku index 0 dan basliyor
        System.out.println("thirdChar = " + thirdChar);


        // char tenthChar = word.charAt(9);  ciktisini almak istersem out of index diyecek,


        System.out.println("--------------------------------------"); // simdi lenght e goz atalim

        // lenght ne kadar karakter oldugunu gosteriyor, yani int kodlucaz

        String s1 = "Betul kizi baya caliskan bir kizdir."; // burada 36 karakterimiz var, bunu bulmak icin
        int totalCharacter = s1.length();
        System.out.println("totalCharacter = " + totalCharacter);

        char lastCharacter = s1.charAt( totalCharacter - 1 ); // burada son karakteri bulmak icin son indexi kodlamak lazim, o da total karakter sayisi-1 olmus oluyor

        System.out.println("lastCharacter = " + lastCharacter);

        char middleCharacter = s1.charAt( totalCharacter / 2 +1 );
        System.out.println("middleCharacter = " + middleCharacter); // heheeee bunu kendimm ekledim yaptim.

        System.out.println("----------------------------------------------------");
        //uppercase lower case methoduna goz atalim

        String str = "wooden spoon"; // bunun hepsini upper case yapmak istiyprum.
        // str.toUpperCase(); // WOODENSPOON olarak cikti istiyoruz ama bundan sonra yazdirsam da yine degismez,
                                // cunku string degistirilemiyor, onun icin onu tekrar yeni variable olarak yapacaz,
                                //yani str yi yeniden deger vermis gibi olucaz.

        str= str.toUpperCase(); // iste bundan sonra yazdirdigimizda str yeni karakteriyle karsimiza cikacak
        System.out.println("str = " + str);




    }

}
