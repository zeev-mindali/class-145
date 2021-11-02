package class2_2810_loops;

import java.util.Scanner;

public class Targil4 {
    public static void main(String[] args) {
        //****
        // ***
        //  **
        //   *
        int triangleSize;
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter triangle base size");
        triangleSize = input.nextInt();

        for (int counter = triangleSize; counter >= 0; counter--) {
            //spaces                    4          3
            for (int spaceCounter = 1; triangleSize - counter >= spaceCounter; spaceCounter++) {
                System.out.print(" ");
            }

            //stars
            for (int starRow = counter; starRow > 0; starRow--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
