package class7_2311_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TargilKita {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("kabooom.txt");
//        PrintWriter pw = new PrintWriter(file);
//        Scanner input = new Scanner(System.in);
//
//
//        System.out.println("Enter a number :");
//        int highBound = input.nextInt();
//
//        for (int counter = 0; counter <= highBound; counter++) {
//            pw.println(counter % 7 == 0 ? "Boom" : counter);
//        }
//        pw.close();


        int highBound = 100;
        int boomCounter = 0;
        Scanner fileInput = new Scanner(file);
        for (int counter = 0; counter < highBound; counter++) {
            String readLine = fileInput.nextLine();
            //System.out.println(readLine);
            if (readLine.equals("Boom")) {
                boomCounter++;
            }
        }
        System.out.println("Total boom:" + boomCounter);


    }
}
