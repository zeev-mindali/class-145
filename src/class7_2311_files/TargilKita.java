package class7_2311_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TargilKita {
    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("kabooom.txt");
        PrintWriter pw = new PrintWriter(file);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number :");
        int highBound = input.nextInt();

        for (int counter = 0; counter <= highBound; counter++) {
            pw.println(counter % 7 == 0 ? "Boom" : counter);
        }

        pw.close();
    }
}
