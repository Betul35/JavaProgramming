package day11_Switch_Scanner;

import com.sun.source.tree.CaseTree;
import day08_IfStatement.SwapTwoVariables_WithTemporaryVariables;

public class Char_WithSwitch {

    public static void main(String[] args) {

        char ch = 'A';


        switch (ch){

            case 'A':
                System.out.println("Excellent");
                break;

            case 'B':
                System.out.println("Great");
                break;

            case 'C':
                System.out.println("Good");
                break;

            case 'D':
                System.out.println("Passed");
                break;

            case 'E':
                System.out.println("Failed");
                break;

            default:
                System.out.println("Invalid");


        }



    }
}
