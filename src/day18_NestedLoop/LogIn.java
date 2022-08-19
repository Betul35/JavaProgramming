package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your user name: ");
        String u = scan.next();

        System.out.println("Enter your password: ");
        String pas = scan.next();

        if (u.equals("Cydeo") && pas.equals("WoodenSpoon")){
            System.out.println("Logged in");
        }else {

            for (int i = 3; i >0 ; i--) {
                System.out.println("Incorrect username or password!\n Enter your username: ");
                u = scan.next();
                System.out.println("Enter your password: ");
                pas = scan.next();

                if (u.equals("Cydeo") && pas.equals("WoodenSpoon")) {
                    System.out.println("Logged in");
                    break;
                }

            }
                if (!(u.equals("Cydeo") && pas.equals("WoodenSpoon"))){
                    System.err.println("Your account is locked! ");
                }


            }

            scan.close();
        }



    }

/*

        2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and if all three attempts are failed, then print "Your account is locked."


 */