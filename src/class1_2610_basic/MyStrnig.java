package class1_2610_basic;

import java.util.Scanner;

public class MyStrnig {
    public static void main(String[] args) {
        String fName;
        String lName;
        int age;
        String userName;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age:");
        age = input.nextInt();   //47(enter)
        //(enter)
        //cleaning the buffer
        input.nextLine();

        System.out.println("Enter user name:");
        userName = input.nextLine();

        System.out.println("Hello " + userName + " your age " + age);
    }
}
