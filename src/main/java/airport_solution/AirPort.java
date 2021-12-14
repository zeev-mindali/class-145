package airport_solution;

import java.util.ArrayList;
import java.util.List;

public class AirPort {
    public static final int TOTAL_PLANE=10;
    private static List<Thread> fleet = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        for (int counter=1;counter<=TOTAL_PLANE;counter++){
            AirPlane airPlane = new AirPlane(counter);
            Thread myPlane = new Thread(airPlane);
            fleet.add(myPlane);
        }

        for (Thread plane:fleet){
            plane.start();
        }
//        for (int counter=0;counter< fleet.size();counter++){
//            fleet.get(counter).start();
//        }

        for (Thread plane:fleet){
            plane.join();
        }

        System.out.println("All planes is on the ground, closing air port");
        Thread.sleep(1000);
        System.out.println("Air port is closed !!!!!");
    }
}
