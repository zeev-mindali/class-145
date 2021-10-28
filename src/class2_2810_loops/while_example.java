package class2_2810_loops;

import java.util.Scanner;

public class while_example {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.println("Enter a positive number:");
            number = input.nextInt();
        } while (number >= 0);

        System.out.println("You are an IDIOT!!!");
    }
}
