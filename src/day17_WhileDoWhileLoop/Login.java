package day17_WhileDoWhileLoop;

import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        // username :"Cydeo"
        // password : "Cydeon123"

        String username = "";
        String password = "";


        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        username = scan.next();
        System.out.println("Please enter your password");
        password = scan.next();

        if (username.equals("Cydeo") && password.equals("Cydeo123")){
            System.out.println("Logged in");
        }else{
            int attempts = 3;
            while ( !(username.equals("Cydeo") && password.equals("Cydeo123")) && attempts>0){
                if (attempts==1){
                    System.out.println("This is your last chance");
                }
                System.out.println("Incorrect username or password,please re-enter user name:");
                username = scan.next();
                System.out.println("Enter your password again: ");
                password = scan.next();
                attempts--;

                }

            if (username.equals("Cydeo") && password.equals("Cydeo123")){
                System.out.println("Logged in");

            }else{
                System.out.println("Your account is locked");
            }
        }
        scan.close();


    }
}
