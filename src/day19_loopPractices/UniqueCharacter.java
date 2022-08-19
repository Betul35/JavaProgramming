package day19_loopPractices;

public class UniqueCharacter {

    public static void main(String[] args) {

        String  str = "aabccdeef";// istenilen output :    bdf, unique characterler
        String result = ""; // unique characheri store yapmak icin

        for (int j = 0; j < str.length(); j++) {// bu da to pick te character

            char ch =str.charAt(j);// tum karakterleri secebilmek icin bunu yapiyoruz
            int freq = 0;

            for (int i = 0; i < str.length(); i++) { //bu compares the character that outer loop picked, to find freq..
                char eachChar = str.charAt(i);
                if (eachChar==ch){
                    freq++;
                }
            }

            if (freq==1){ // if the freq of the character is 1, then the char. is unique
                result+=ch;
            }

        }
        System.out.println(result);










    }
}
/*

	2. Write a program that can find the unique characters from a string
	without using indexOf() and lastIndexOf() methods

    			Ex:
                        str = "aabccdeef";

                        output:
                                bdf

 */
