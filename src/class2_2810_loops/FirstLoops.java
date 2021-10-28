package class2_2810_loops;

public class FirstLoops {
    public static void main(String[] args) {
        String fName = "Zeevik";
        String lName = " the fox";

        String victim = "Tal ";
        String criminal = "Tal ";
        String policeMan = "Tal ";
        int yearInJail = 15;
        String country = "United Arab";

        System.out.println("your name is :" + fName + lName);
        System.out.printf("your name is: %s %s\n", fName, lName);

        System.out.printf("Once upon a time in %s there was a child calld %s, " +
                "and ride to the forset, " +
                "there he meet %s, who told him that he have a candy\n" +
                "but %s was there to stop the bussniess.....\n" +
                "he will get out of prison in the year %d", country, victim, criminal, policeMan, 2021 + yearInJail);
    }
}
