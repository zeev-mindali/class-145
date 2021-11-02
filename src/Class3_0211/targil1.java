package Class3_0211;

import java.util.Scanner;

public class targil1 {
    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner input = new Scanner(System.in);

        System.out.println("In your mother in law, Please enter 10 numbers:");
        for (int counter = 0; counter < numbers.length; counter++) {
            numbers[counter] = input.nextInt();
        }

        System.out.println("---------------------------------------------");
        for (int item : numbers) {
            System.out.print(item % 2 == 0 ? item + "," : "");
        }

    }
}
