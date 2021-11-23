package class7_2311_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Nadav");
        names.add("Anna");
        names.add("Itzik");
        names.add("Ran");
        names.add("Tal");
        names.add("Tal");
        names.add("Tal");

        System.out.println(names);

        List<Person> victims = new ArrayList<>();
        victims.add(new Person("Ran", 27));
        victims.add(new Person("Anna", 20));
        victims.add(new Person("Itzik", 22));
        victims.add(new Person("Zeevik", 47));
        victims.add(new Person("Hong", 22));
        victims.add(new Person("Emmnual", 22));

        System.out.println(victims);

        //sort by age (high->low)
        Collections.sort(victims, new ComparePersonsByAge());

        System.out.println(victims);
    }
}
