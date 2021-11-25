package Files_Targil;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) throws FileNotFoundException {
        Phone zeev = new Phone("0524213990", "zeev", 100);
        Phone nadav = new Phone("0521235467", "nadav wife", 2500);
        Phone shiri = new Phone("054123456", "Shiri");

        File file = new File("test");
        /*
        PrintWriter pw = new PrintWriter(file);
        zeev.save(pw);
        nadav.save(pw);
        shiri.save(pw);
        pw.close();
        */

        Scanner input = new Scanner(file);
        Phone p1 = new Phone(input);
        Phone p2 = new Phone(input);
        Phone p3 = new Phone(input);

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
