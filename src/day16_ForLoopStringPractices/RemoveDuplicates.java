package day16_ForLoopStringPractices;

public class RemoveDuplicates {

    public static void main(String[] args) {

        String str = "aabbaacc"; //8 character var

        String result = ""; //abc, bunu istiypruz

        for (int i = 0; i<= str.length()-1; i++) { // yada ortadakini soyle yazabiliriz: i < str.lenght();
            // char ch = str.charAt(i);
            // boyle yaziyoruz ama asagida contain method String istedigi icin stringe cevirecegiz
            String ch = "" + str.charAt(i); // bunu yazdirirssak yine tum characterleri yazacak onun icin if condition veriyoruz

            if (!result.contains(ch)){
                result += ch; //characherler birbirine eklenerek yazilacak
            }
        }

        System.out.println(result);
    }
}
/*
2. Write a program that can remove the duplicated characters from a String
			Ex:
				input:
					AABBCCBC

				Output:
					ABC

			Hint: You can add each characters of the string into another String
				  Condition: the character is not contained in the other String yet before you are adding


 */
