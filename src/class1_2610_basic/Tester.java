package class1_2610_basic;

import java.util.Scanner;

public class Tester {
    //shortcut for create main -> main
    public static void main(String[] args) {
        //declare a variable
        int userAge; //getting user age

        int salary;  //holding user salary

        // userAge (camel case)
        /*
        int userAge, //user age
                userGrade, //current grade
                userSalary; //wish salary
         */
        //shortcut for create print command -> sout
        //System.out.println("Hello World :)");

        //for getting input from user, we will use Scanner
        Scanner input = new Scanner(System.in);
        //asking
        System.out.println("Please enter your age:");
        //int userAge = input.nextInt();
        userAge = input.nextInt();
        System.out.println("you was born in : " + (2021 - userAge));

        //remark for single line - tell what the line do, or take line out

        /*
                block of remark
         */

        //todo: we need to save the program to a unique folder


    }
}
