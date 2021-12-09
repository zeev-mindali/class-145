package my_threads;

import lombok.SneakyThrows;

import java.util.Date;

public class SmartClock {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @SneakyThrows
            @Override
            public void run() {
                while (true){
                    System.out.println(new Date());
                    Thread.sleep(1000);
                }
            }
        }).start();
    }
}
