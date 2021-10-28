package class1_2610_basic;

import java.util.Scanner;

public class BooleanDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Are you an idiot?");
        boolean isIdiot = input.nextBoolean();

        System.out.println("you are idiot? :" + isIdiot);
    }
}
