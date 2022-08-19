package day19_loopPractices;

public class day19_LoopPractices {

    public static void main(String[] args) {
        String str = "aabcccd";

        String result = ""; // output : a2b1c3d1

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);// burada indexlerin char ini buluyoruz, yani each karakteri bulmakla sorumnlu bu
            int frequency = 0;

            for (int i = 0; i < str.length(); i++) { // bu loop da frequency leri bulmakla yukumlu
                char each = str.charAt(i); // each of the string characters i buluyoruz suan
                if (each==ch){
                    frequency++;
                }
            }

            if (result.contains(""+ ch)){
                continue;
            }
            result +=ch;
            result += frequency;


        }
        System.out.println(result);





    }
}
/*
1. Write a program that can find the frequency of the characters from a string

			 Ex:
                        str = "aabcccd";

                        output:
                                a2b1c3d1


 */
