package day12_Scanner;

// import java.util.*; // normali java.util.Scanner, ama simdi * koyduk, ti omport everthing from the package
import java.util.Scanner; // bu da normali, sadece ne istediysek onu impot yapiyor, yani safe the cost and data, takes more memory
//we need to import states here, kisayol icin mainin icine Scan kisayolunu tuslayabiliriz.
public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); // we assign variable bir daha kullanabilmek icin

        System.out.println("Enter a number between 1 to : ");

        int num = scan.nextInt();

        String result = " "; // temporary value ,
                            // ama eger yuzde yuz eminsen sonunda result hep string olacak, yani gunler gibi, o zaman soyle yazabuilirsin
                            // String result;

        if(num>=1 && num<=7){ // 7 possibilities // simdi burada Ternaries kullaniyoruz.

            result = (num == 1)? "Monday" : (num==2)? "Tuesday" : (num==3)? "Wednesday" : (num==4)? "Thursday" :
                    (num==5)? "Friday" : (num==6)? "Saturday" : "Sunday";



        }else {
            result = "Invalid Number";
        }

        System.out.println(result);


        scan.close(); // bu scan i kapatmak icin,bunu kapattiktan sonra 34 line den sonra scan kullanamam
                      // artik kullanmayacaksan en sonunda scani kapatmak icin bunu kodla



    }
}
