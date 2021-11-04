package Test_Solution;

import java.util.Scanner;

public class Targil3 {
    //7 boom
    public static void main(String[] args) {
        final int BOOM_NUMBER = 7;
        Scanner input = new Scanner(System.in);
        int lowNum, highNum;
        System.out.println("enter two numbers:");
        lowNum = input.nextInt();
        highNum = input.nextInt();
        for (int counter = lowNum; counter <= highNum; counter++) {
            if (counter % BOOM_NUMBER == 0 || isContainsSeven(counter, BOOM_NUMBER)) {
                System.out.println("Boom!!!");
            } else {
                System.out.println(counter);
            }

        }
    }

    public static boolean isContainsSeven(int number, int boomNumber) {
        while (number > 0) {
            if (number % 10 == boomNumber) {
                return true;
            }
            number /= 10;
        }
        return false;
    }
}
