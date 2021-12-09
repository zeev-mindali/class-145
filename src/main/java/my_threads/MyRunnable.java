package my_threads;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int counter=0;counter<100;counter++){
            System.out.println(counter+":zeev");
        }
    }
}
