package Test_Solution;

import java.util.Scanner;

public class Targil1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int avg = 0, counter = -0, userNumber = 0;
        /* no good
        while (userNumber>=0){
            userNumber = input.nextInt(); //-5
            avg+=userNumber;
            counter++;
        }
        */
        /* no good
        do{
            avg+=userNumber;
            counter++;
            userNumber = input.nextInt();
        } while (userNumber>=0);
         */
        while (userNumber >= 0) {
            avg += userNumber;
            //counter+=userNumber>=0?1:0;
            counter++;
            userNumber = input.nextInt();
        }
        //counter--;
        System.out.println("avg: " + (avg / (counter - 1)));

    }
}
