package class7_2311_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class MyFiles {
    public static void main(String[] args) throws FileNotFoundException {
        File myFile = new File("caspomat.key");
        PrintWriter pw = new PrintWriter(myFile);
        pw.println("Hello class 822/145\n");
        pw.print("Caspomat number :");
        for (int c = 1; c < 5; c++) {
            pw.print(c);
        }
        pw.println();
        pw.println("Itzik siman tov caspomt: 3495 (it will sallow the card, no money)");
        pw.close();
    }
}
