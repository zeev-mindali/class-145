package class2_2810_loops;

import java.util.Scanner;

public class Targil7 {
    public static void main(String[] args) {
        int carpetSize; //to get carpet size from user will be carpetSize*carpetSize
        Scanner input = new Scanner(System.in);

        //*** *** ***
        //*** *** ***
        //*** *** ***
        //
        //*** *** ***
        //*** *** ***
        //*** *** ***
        //
        //*** *** ***
        //*** *** ***
        //*** *** ***

        System.out.println("Enter Carpet size:");
        carpetSize = input.nextInt();
        for (int carpetCounter = 0; carpetCounter < carpetSize; carpetCounter++) {
            for (int rowCounter = 0; rowCounter < carpetSize; rowCounter++) {
                for (int colCounter = 0; colCounter < carpetSize; colCounter++) {
                    for (int innerCounter = 0; innerCounter < carpetSize; innerCounter++) {
                        System.out.print("*");
                    }
                    System.out.print(" ");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
