package day17_WhileDoWhileLoop;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        String  str = "Cat CAT cAT Dog Dog";

        int frequency = 0;


        for (int i = 0; i < str.length()-2; i++) {
        String word = str.substring(i, i+3);

        if (word.equalsIgnoreCase("Cat") || word.equals("Dog")){
            frequency++;
        }
        }
        System.out.println("frequency = " + frequency);



    }
}
