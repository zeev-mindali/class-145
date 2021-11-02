package Class3_0211;

import java.util.Scanner;

public class Targil_Veez {
    public static void main(String[] args) {
        //כתבו את תוכנת הפוך הפוך
        // Zeev -> Veez
        Scanner input = new Scanner(System.in);
        String myInput;
        System.out.println("Please enter your full name:");
        myInput = input.nextLine();

        for (int counter = myInput.length() - 1; counter >= 0; counter--) {
            System.out.print(myInput.toCharArray()[counter]);
        }
    }
}
//zeev mindali
//convert to char array
//[z][e][e][v][ ][m][i][n][d][a][l][i]