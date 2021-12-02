package functional_programing.oldSchool;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static functional_programing.oldSchool.Gender.*;

public class Tester {
    public static void main(String[] args) {
        List<Person> pepole = List.of(
                new Person("Zeev", Male),
                new Person("Amital",Female),
                new Person("Hilda", Female),
                new Person("Sasson",Male),
                new Person("Michal",Female)
        );

        //Imperative approach
        List<Person> females = new ArrayList<>();
        for (Person person:pepole){
            if (Female.equals(person.getGender())){
                females.add(person);
            }
        }

        for (Person female:females){
            System.out.println(female);
        }

        System.out.println();


        //Declarative approach
        List<Person> females2 = pepole.stream()
                .filter(person->Female.equals(person.getGender()))
                .collect(Collectors.toList());

        females2.forEach(System.out::println);
    }
}
