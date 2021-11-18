package class6_1811_targilClock;

public class Clock {
    private int hours;
    private int minutes;
    public static final int MAX_HOURS = 24;
    public static final int MAX_MINUTES = 60;
    private static int format = 24;
    private static String ampm = "";

    public Clock(int hours, int minutes) {
        setHours(hours);
        setMinutes(minutes);
    }

    public Clock(Clock other) {
        this.hours = other.hours;
        this.minutes = other.minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours % MAX_HOURS;
        ampm = this.hours > 12 ? "PM" : "AM";
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes % MAX_MINUTES;
    }

    @Override
    public String toString() {
        return (this.hours % format < 10 ? "0" + this.hours % format : this.hours % format)
                + ":"
                + (this.minutes < 10 ? "0" + this.minutes : this.minutes) + " "
                + (format == MAX_HOURS ? "" : ampm);

    }

    public static void set24(boolean is24) {
        format = is24 ? MAX_HOURS : MAX_HOURS / 2;
    }
}
