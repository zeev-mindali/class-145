package class2_2810_loops;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the base:");
        int base = input.nextInt(); //5

        for (int rows = 1; rows <= base; rows++) {
            for (int spaces = 0; spaces < base - rows; spaces++) {
                System.out.print(" ");
            }
            for (int cols = 1; cols < rows * 2; cols++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
