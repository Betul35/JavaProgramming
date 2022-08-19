package day24_CustomMethodReturn;

public class ReturnMethodPractice3 {

    public static void main(String[] args) {
       // to find if the character is unique

        String str = "aabccddeee";


        for (int i = 0; i < str.length(); i++) {
           int frequency =  frequency(str, str.charAt(i));

           if (frequency==1){
               System.out.println(str.charAt(i));

           }
        }


    }

                                //"aabcd" , 'a'  for instance
    public static int frequency(String str,char ch){ //string ve char veriyoruz ki string in icinde char ne kadar siklikta gecmis onu bulma icin

        int count = 0;

        for (char each : str.toCharArray()) { //toCharArray kullaniyorum ki stringdeki her bir elementi yakalamak icin

            if (each==ch){
                count++;
            }

        }
        return count;
    }



}
