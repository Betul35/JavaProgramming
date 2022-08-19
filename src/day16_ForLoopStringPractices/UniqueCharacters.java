package day16_ForLoopStringPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaabccc";
        String result = "";

       /*
            //0             ==      2   ==> bunlar esit olmadigi icin a unique degil
            if (str.indexOf('a') == str.lastIndexOf('a')){
            result += 'a';
        }
        */

        for (int i = 0; i < str.length(); i++) { // veya i <= str.lenght()-1 yazabilirsin
            char ch = str.charAt(i);
            if (str.indexOf(ch)==str.lastIndexOf(ch)){ // unique mi degil mi diye burada kontrol ediyoruz
                result +=ch;
            }
        }
        System.out.println(result);


    }
}
/*

	3. Write a program that can return the unique characters from a String

			Ex:
				input:
					AABCCD

				output:
					BD

			Hint: You will need indexOf() and lastIndexOf()
				  if the first and last index numbers of the character are same, then it's unique



				  indexOf('A') ==> 0
				  lastIndexOf('A') ==> 1

                                                eger indexof ve lastindexof birbirine esitse o carakter unique dir

				  indexOf('B') ==>2
				  lastIndexOf('B') ==> 2


 */
