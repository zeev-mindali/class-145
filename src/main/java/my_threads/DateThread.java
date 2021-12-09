package my_threads;

import java.io.IOException;
import java.util.Date;

public class DateThread {
    public static void main(String[] args) throws IOException {


        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int counter=0;counter<20_000_000;counter++) {
                    System.out.println(new Date() + " Itzik siman tov RULZ!!!!");
                }
            }
        }).start();

    }
}
