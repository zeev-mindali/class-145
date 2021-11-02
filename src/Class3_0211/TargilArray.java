package Class3_0211;

import java.util.Scanner;

public class TargilArray {
    public static void main(String[] args) {
        //get a number , type long
        //print how many times a digit was presented
        //11313111  - 1->6 3->2

        int userNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("please enter a number:");
        userNumber = input.nextInt();
        int[] appernace = new int[10];
        int tempNumber = userNumber;

        while (tempNumber > 0) {
            appernace[tempNumber % 10]++;
            tempNumber /= 10;
        }

        for (int counter = 0; counter < appernace.length; counter++) {
            if (appernace[counter] > 0) {
                System.out.printf("number %d appears %d\n", counter, appernace[counter]);
            }
        }
    }
}
