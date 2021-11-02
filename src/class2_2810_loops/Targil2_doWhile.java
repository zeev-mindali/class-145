package class2_2810_loops;

import java.util.Scanner;

public class Targil2_doWhile {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        long num = 75219852198795218L;
        boolean exp1, exp2, exp3, result;
        do {
            System.out.println("please enter a number (not zero)");
            number = input.nextInt();
            //test github upload
            //} while (number < 100 || number > 999 || number % 7 != 0);
        } while (number / 10 != number % 10);
    }
}
