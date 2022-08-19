package day28_ArrayList;

public class StrongPassword {

    public static void main(String[] args) {

        String password = "Cydeo1990@";

        boolean r1 = password.length() >= 8 && !password.contains(" ");  //1.1 icin
        boolean r2 = false; //has upper case
        boolean r3 = false;//has lower case
        boolean r4 = false;//has special char
        boolean r5 = false;//hs digit

        char[] chars = password.toCharArray(); //burada tum characterleri array char olarak yazdiriyoruz ki loop ile tum elementlere ulasabilelim

        for (char each : chars) {

            if (Character.isUpperCase(each)) { //bunlari Character olarak adlandirdigimiz methottad cagiriyoruz
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            } else { //special char one
                r4 = true;
            }

        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;

        System.out.println("isStrongPassword = " + isStrongPassword);


    }

        public static boolean isStrongPassword(String password){ // burada da custom method olusturduk
        boolean r1 = password.length()>=8 && !password.contains(" ");  //1.1 icin
        boolean r2 = false; //has upper case
        boolean r3 = false;//has lower case
        boolean r4 = false;//has special char
        boolean r5 = false;//hs digit

        char[] chars = password.toCharArray(); //burada tum characterleri array char olarak yazdiriyoruz ki loop ile tum elementlere ulasabilelim

        for (char each : chars) {

            if (Character.isUpperCase(each)){ //bunlari Character olarak adlandirdigimiz methottad cagiriyoruz
                r2 = true;
            } else if (Character.isLowerCase(each)) {
                r3 = true;
            } else if (Character.isDigit(each)) {
                r5 = true;
            }else{ //special char one
                r4 = true;
            }

        }
        boolean isStrongPassword = r1 && r2 && r3 && r4 && r5;
        return isStrongPassword;


    }






}
/*
1.Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space
        1.2 PassWord should at least contain one upper case letter
        1.3 PassWord should at least contain one lower case letter
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit

 */
