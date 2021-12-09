package my_threads;

public class TiredTester {
    public static void main(String[] args) {
        Runnable meSleepy = new TiredThread();
        Thread meRun = new Thread(meSleepy);

        meRun.start();
    }
}
