package day14_StringMethods;

public class StringMethods1 {

    public static void main(String[] args) {

        // Trim method String icindeki beyaz bosluklari siliyor.
        String str1 = "     batch 25         ";
        str1 = str1.trim(); // "batch 25"

        System.out.println(str1);


        System.out.println("--------------------------------------------------");


        //indexOf method, () bunun icine yazdigimiz karakterin indexini bize veriyor.
        String str2 = "Cydeo School";
        int n1 = str2.indexOf("h"); // burada bize h kacinci indexteymis onu verecek

        System.out.println("n1 = " + n1);
        //ama ya bir suru ayni karakterden olursa?

        int n2 = str2.indexOf("ool"); // burada aslinda baktigimiz ikinci 'o' yani 9. index sirasinda olan, onu unique yapiyoruz ki anlasin, bulsun.
        System.out.println("n2 = " + n2);


        String str3 = "Java Programming language"; // find the third a

       int n3 = str3.indexOf("amm");
        System.out.println("n3 = " + n3);

        int n4 = str3.indexOf("g ");
        System.out.println("n4 = " + n4);

        System.out.println("------------------------------");

        //lastindexof bu da indexi buluyor ama right side den bakmaya basliyor, yani sondan

        int n5 =str3.lastIndexOf("g"); // mesela burada sondaki g nin indexini bulmaya calisiyoruz.
        System.out.println("n5 = " + n5);

        System.out.println("-----------------------------------------------");

        String s = "Java Nova Cava Wawa orange";


        int firstA = s.indexOf("a");
        int lastA = s.lastIndexOf("a");
        int secondA = s.indexOf("a ");
        int thirdA = s.indexOf("a C");
        System.out.println("firstA = " + firstA);
        System.out.println("lastA = " + lastA);
        System.out.println("secondA = " + secondA);
        System.out.println("thirdA = " + thirdA);

        System.out.println("--------------------------------------");





    }
}
