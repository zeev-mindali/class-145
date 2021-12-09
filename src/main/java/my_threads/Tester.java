package my_threads;

public class Tester {
    public static void main(String[] args) {
        Runnable r1 = new MyRunnable();
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r1);
        MyThread t3 = new MyThread();

        Thread zeev=new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Ran iz in the House !!!");
            }
        });
        zeev.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("My name is Katz, Nir Katz");
            }
        }).start();




        //t1.start();
        //t1.start();
        //t2.start();
        //t3.start();
        System.out.println("Rak shnaya !!!!!!");
    }
}
