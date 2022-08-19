package day17_WhileDoWhileLoop;

public class BranchingStatements2 {

    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E' ; i++) {

            if (i=='C'){
                continue; // buarada sunu diyoruz, C yi skip et, yazdirma
            }

            System.out.println(i);

        }
        System.out.println("---------------------------------------------------");
        //print even numbers 1~10  like 2 4 6 8 10

        for (int i = 1; i <=10 ; i++) {

            if (i%2 != 0){
                continue;
            }
            System.out.println(i);
        }



        System.out.println("---------------------------------------------------");
        //print odd numbers 1~10    1 3 5 7 9

        for (int i = 1; i <=10 ; i++) {
            if (i%2 != 0){

                System.out.println(i);
            }
        }


    }
}
