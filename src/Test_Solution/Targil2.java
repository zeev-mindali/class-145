package Test_Solution;

import java.util.Scanner;

public class Targil2 {
    public static void main(String[] args) {
        //prime number
        Scanner input = new Scanner(System.in);
        int userPrime;
        boolean isPrime = true;

        System.out.println("Please enter a number for check:");
        userPrime = input.nextInt(); //13-2-1=10
        for (int counter = 2; counter < userPrime / 2; counter++) {
            if (userPrime % counter == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(userPrime + " number is prime:" + isPrime);
    }
}
