package class1_hw;

import java.util.Scanner;

public class class1_hw_2_1 {
    public static void main(String[] args) {
        final int PRICE_3 = 120;
        final int PRICE_4 = 150;
        final int PRICE_5 = 180;
        final int PRICE_5_DUPLEX = 200;

        int roomNumber;
        boolean isDuplex;
        int totalSum = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter room number:");
        roomNumber = input.nextInt();

        /*
        if (roomNumber == 3) {
            System.out.println("Total price :" + PRICE_3);
        } else if (roomNumber == 4) {
            System.out.println("Total price :" + PRICE_4);
        } else if (roomNumber == 5 && !isDuplex) {
            System.out.println("Total price :" + PRICE_5);
        } else if (roomNumber == 5 && isDuplex) {
            System.out.println("Total price :" + PRICE_5_DUPLEX);
        } else {
            System.out.println("WTF?!?!?");
        }
        */

        switch (roomNumber) {
            case 3:
                //System.out.println("Total price :" + PRICE_3);
                totalSum = PRICE_3;
                break;
            case 4:
                //System.out.println("Total price :" + PRICE_4);
                totalSum = PRICE_4;
                break;
            case 5:
                System.out.println("Is it a duplex (y/n)?");
                isDuplex = input.next().charAt(0) == 'y';
                /*
                if (!isDuplex) {
                    System.out.println("Total price :" + PRICE_5);
                } else {
                    System.out.println("Total price :" + PRICE_5_DUPLEX);
                }
                */
                //System.out.println("Total price: " + (isDuplex ? PRICE_5_DUPLEX : PRICE_5));
                totalSum = isDuplex ? PRICE_5_DUPLEX : PRICE_5;
                break;
            default:
                System.out.println("WTF?!?!?!?");
        }
        System.out.println("הוועד הולך לגנוב ממך סכום של: " + totalSum);
    }
}
