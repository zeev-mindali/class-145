package Inheritance_Targil2;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        final float programmerSalary = 17000f;
        final float secretarySalary = 7000f;

        Scanner input = new Scanner(System.in);

        String userName;
        int userId;
        float userSalary;

        /*
        userName = input.nextLine();
        userId = input.nextInt();
        userSalary = input.nextFloat();

        Programmer talBait = new Programmer(userName,userId,userSalary);
        */

        Programmer tomer = new Programmer("Tomer", 1002, 17000f);
        Programmer talKita = new Programmer("Tal Rozner", 1003, 12000f);

        Secretary nadav = new Secretary("Nadav", 1005, 7000f, 500);
        Secretary asi = new Secretary("Asi", 1004, 25000f, 500); //ceo bitch


        System.out.println(tomer);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(talKita);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(nadav);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(asi);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println();
        System.out.println(asi.showBanner());
        tomer.calcBouns();
        talKita.calcBouns();
        nadav.calcBouns();
        asi.calcBouns();
        System.out.println(tomer);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(talKita);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(nadav);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println(asi);
        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println();

    }
}
