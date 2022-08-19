package day08_IfStatement;

public class GradeReport {


    public static void main(String[] args) {

        System.out.println( true == !false ); //ture
        System.out.println( !true != false);  //false
        System.out.println( !false ); //false
        System.out.println(!!false); //false

        System.out.println("-----------------------");

        int score = 85;
        boolean a = score > 89 && score <= 100;
        boolean b = score > 79 && score <90; // or && !a;
        boolean c = score > 69 && score< 80; // or &&!a && !b
        boolean d = score > 59 && score < 70;
        boolean e = score<= 59; // or direk soyle yaz boolean e = !a && !b && !c && !d

        if(a){
            System.out.println(score + "==> Excellent"); // or direk soyle yaz ("Excellent")
        }

        if(b){
            System.out.println(score + "==> Great");
        }

        if (c){
            System.out.println(score + "==> Good");
        }

        if(d){
            System.out.println(score + "==> Passed");
        }

        if(e){
            System.out.println( score + "==> Failed");
        }





    }
}

/*

    score:
        a 90 ~ 100 ==> Excellent
        b 80 ~ 89 ==> Great
        c 70 ~ 79 ==>Good
        d 60 ~ 69 ==> Passed
        e 0 ~ 59 ==> Failed

 */