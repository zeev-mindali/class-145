package class6_1811_targilClock;

public class Tester {
    public static void main(String[] args) {
        Clock myClock = new Clock(22, 38);
        System.out.println(myClock);
        //display in 12 hours format
        Clock.set24(false);
        System.out.println(myClock);
        Clock.set24(true);
        System.out.println(myClock);
    }
}
