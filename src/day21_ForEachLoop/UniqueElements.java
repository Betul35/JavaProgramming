package day21_ForEachLoop;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"Java", "Java", "C=", "Python", "Python"};



        for (String every : words) {

            int freq = 0;
            for (String word : words) {
                if (word.equals(every)){
                    freq++;
                }
            }
            if (freq==1){
                System.out.println(every);
            }

        }





    }
}

