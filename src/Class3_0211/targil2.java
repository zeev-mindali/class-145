package Class3_0211;

import java.util.Scanner;

public class targil2 {
    public static void main(String[] args) {
        char[] myChars = new char[10];
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter " + myChars.length + " chars:");
        for (int counter = 0; counter < myChars.length; counter++) {
            myChars[counter] = input.nextLine().charAt(0);
        }

        for (char item : myChars) {
            System.out.println((item >= 'A' && item <= 'Z') ? item + " " : "");
        }
    }
}
