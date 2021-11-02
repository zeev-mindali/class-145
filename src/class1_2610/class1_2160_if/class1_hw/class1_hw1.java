package class1_2610.class1_2160_if.class1_hw;

import java.util.Scanner;

public class class1_hw1 {
    public static void main(String[] args) {
        final int CURRENT_YEAR = 2021;

        int bYear;
        int id;
        int height;
        //char maleFemale='U';
        boolean isTal;

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter birth year:");
        bYear = input.nextInt();
        System.out.println("Please enter your ID number:");
        id = input.nextInt();
        System.out.println("Please enter your height:");
        height = input.nextInt();
        System.out.println("are you tal edri (true/false):");
        isTal = input.nextBoolean();

        System.out.println("user details\n==========\nheight: " + height
                + "\nID: " + id
                + "\nAge: " + (CURRENT_YEAR - bYear)
                + "\nfemale: " + isTal);
    }
}
