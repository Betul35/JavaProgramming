package day17_WhileDoWhileLoop;

public class FrequencyOfWord {

    public static void main(String[] args) {

        String  str = "JavaJava";

        int frequency = 0;

        for (int i = 0; i < str.length()-3; i++) { // -3 yaptik, cunku asagida 4 eklemek gerekiyor, ama i== 7 olunca asagida 11 oldugundan error verecek, bunu onlemeye calisiyoruz
          String eachSub =   str.substring(i , i+4);
                                            // bura en fazla 7 olabilir, cunku lenght=7 ondan yukarida -3 yaptik.
          if (eachSub.equals("Java")){
              frequency++;
          }

        }

        System.out.println(frequency);

    }
}
/*

	2. write a program that can return the frequency of the word Java from the sentence

        Ex:
            sentence = "JavaJavaJava";

            output: 3


           	Str = "JavaJava";

           		substrings:
           			1. Java  //substring(0, 4)
           			2. avaJ  //substring(1, 5)
           			3. vaJa  // substring(2, 2+4 )
           			4. aJav  // substring(3, 3+4)
           			5. Java  // substring(4, 4+4)


 */
