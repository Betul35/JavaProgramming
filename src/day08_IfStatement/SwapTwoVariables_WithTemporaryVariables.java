package day08_IfStatement;

import javax.lang.model.SourceVersion;

public class SwapTwoVariables_WithTemporaryVariables {

    public static void main(String[] args) {

        int a = 10;
        int b = 15;
//---------------------------------------------------
       int c = b; // cunku b yi asagida 10 yaptik, a yi b ye cevirmek istiyorsak b ye ilk haliyle baska bir isim vermeliyiz, sonra da onu a ile swap yapabiliriz.
       b =a; // b=10
       a = c; //a=15




   //---------------------------------------------------
        System.out.println("a = " + a);  // we expect it to be 15
        System.out.println("b = " + b); // we expect it to be 10





    }
}

/*
        Ex:
        if a=10, b=15

        output:
            a = 15
            b = 10
 */
