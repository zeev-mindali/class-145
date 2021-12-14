package airport_solution;

public class AirPlane implements Runnable {
    private final int airPlaneId;
    private final int takeOffTime = (int) (Math.random() * 500) + 500; //500->1000
    private final int landingTime = (int) (Math.random() * 500) + 500;
    private final int distanceTime = (int) (Math.random() * 500) + 500;
    public static final Object mutex = new Object();

    public AirPlane(int airPlaneId) {
        this.airPlaneId = airPlaneId;
    }

    @Override
    public void run() {
        try {
            takeOff();
            fly();
            land();
        } catch (InterruptedException e) {
            System.out.println("Huston we have a problem (Tom Hanks):\n====================================");
            System.out.println(e.getMessage());
        }
    }

    private void land() throws InterruptedException {
        System.out.println("plane #" + this.airPlaneId + " wants to land");
        synchronized (mutex) {
            System.out.println("plane #" + this.airPlaneId + " is landing");
            Thread.sleep(landingTime);
            System.out.println("Plane #" + this.airPlaneId + " is landed !!!!");
        }
    }

    private void fly() throws InterruptedException {
        System.out.println("Plane #" + this.airPlaneId + " is flying for "+distanceTime+" ms");
        Thread.sleep(distanceTime);
    }

    private void takeOff() throws InterruptedException {
        System.out.println("Plane #" + this.airPlaneId + " want to take off");
        synchronized (mutex) {
            System.out.println("plane #" + this.airPlaneId + " is taking off");
            Thread.sleep(takeOffTime);
            System.out.println("plane #" + this.airPlaneId + " is in the air !!!!");
        }
    }
}
