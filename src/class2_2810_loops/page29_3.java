package class2_2810_loops;

import java.util.Scanner;

public class page29_3 {
    public static void main(String[] args) {
        int userNumber;
        Scanner input = new Scanner(System.in);
        System.out.println("enter a number, two digit golden number to stop");
//        do {
//            userNumber=input.nextInt();
//        } while(userNumber/10!=userNumber%10);10
        userNumber = input.nextInt();
        while (userNumber / 10 != userNumber % 10) {
            userNumber = input.nextInt();
        }

//        while (true) {
//            userNumber = input.nextInt();
//            if (userNumber / 10 == userNumber % 10) {
//                break;
//            }
//        }
        System.out.println("THE END :(");
    }
}
