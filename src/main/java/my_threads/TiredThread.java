package my_threads;

public class TiredThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Connect to data base");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Error in connection !!!!");
    }
}
