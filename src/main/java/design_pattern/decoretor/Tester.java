package design_pattern.decoretor;

public class Tester {
    public static void main(String[] args) {
        JavaCollage nadav = new JavaCollage("John bryce",
                new JavaStudent(
                        new Student("Nadav (talent)", 37), 11));

        nadav.showDetail();
    }
}
