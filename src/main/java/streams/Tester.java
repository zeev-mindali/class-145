package streams;

import org.checkerframework.checker.units.qual.C;
import streams.beans.Car;
import streams.beans.Person;
import streams.beans.PersonDTO;
import streams.mock.MockData;
import streams.util.TablePrinter;

import java.io.IOException;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Tester {
    public static void main(String[] args) throws IOException {
        //runPepoleFilter();
        runCarDemo();
        //streamDemo();
        //groupDemo();
        //howManyTimes();
        //countingStars();
        //myString();
        //sorting();

        //statistics();
        //ourDTO();
        //flatMap();
    }

    private static void flatMap() {
        List<List<String>> arrayListOfName = List.of(
                List.of("Zeev","Amital","Jacob"),
                List.of("Gabi","Tom","Eliran"),
                List.of("Omer","Dan")
        );
        System.out.println(arrayListOfName);

        List<String> names = new ArrayList<>();
        for (List<String> strings:arrayListOfName){
            names.addAll(strings);
        }
        System.out.println(names);

        List<String> flatMap = arrayListOfName.stream()
                .flatMap(List::stream)
                .collect(Collectors.toList());

        System.out.println(flatMap);
    }

    private static void ourDTO() throws IOException {
        Function<Person, PersonDTO> personTopersonDTO= person->
                new PersonDTO(
                        person.getId(),
                        person.getFirstName()+" "+person.getLastName(),
                        person.getAge()
                );

        List<PersonDTO> dtos=MockData.getPepole().stream()
                .filter(person -> person.getAge()>30)
                .map(personTopersonDTO)
                .limit(10)
                .collect(Collectors.toList());

        dtos.forEach(System.out::println);

    }

    private static void statistics() {
        /*
        List<Integer> numbers = List.of(1,2,3,100,23,93,99);
        Integer min = numbers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(min);
        */
        //old Shiri
        Car cheapCar = MockData.getCars().stream()
                .filter(car->car.getYear()>2012)
                .min(Comparator.comparing(Car::getPrice)).get();
        System.out.println(cheapCar);
        //fullstuck Shiri
        Car expensiveCar = MockData.getCars().stream()
                .max(Comparator.comparing(Car::getPrice)).get();

        System.out.println(expensiveCar);

        long count = MockData.getCars().stream()
                .filter(car->car.getMake().equalsIgnoreCase("bmw"))
                .filter(car->car.getYear()>2010)
                .count();

        System.out.println("Total Ford: "+count);

        double min = MockData.getCars().stream()
                .mapToDouble(Car::getPrice)
                .min()
                .orElse(0);
        System.out.println("Cheapest car: "+min);

        double average = MockData.getCars().stream()
                .mapToDouble(Car::getYear)
                .average()
                .orElse(-1);

        System.out.println("Average year: "+(int)average);

        double totalSum = MockData.getCars().stream()
                .mapToDouble(Car::getPrice)
                .sum();


        System.out.println("total sum price: "+totalSum);
    }

    private static void sorting() throws IOException {

        /*
        List<String> sortedByName = MockData.getPepole().stream()
                .map(Person::getFirstName)
                .sorted()
                .collect(Collectors.toList());
        System.out.println(sortedByName);
        */
        Comparator<Person> compareByAgeAndName = Comparator
                .comparing(Person::getAge)
                .reversed()
                .thenComparing(Person::getLastName);

        List<Person> sortedByAgeAndName = MockData.getPepole().stream()
                .sorted(compareByAgeAndName)
                .limit(10)
                .filter(person->person.getAge()>90)
                .collect(Collectors.toList());
        sortedByAgeAndName.forEach(System.out::println);

    }

    private static void myString() {
        List<String> names = List.of("zeev", "amital", "tal", "gabi", "jacob");
        /*
        StringBuilder join = new StringBuilder();
        for (String name:names){
            join.append(name.substring(0,1).toUpperCase())
                    .append(name.substring(1))
                    .append(", ");
        }

        System.out.println(join.substring(0,join.length()-2)+);
        */
        String join = names.stream()
                .map(name -> name.substring(0, 1).toUpperCase() + name.substring(1))
                .collect(Collectors.joining(", "));

        System.out.println(join);
    }

    private static void countingStars() throws IOException {
        /*
        for (int index=0;index<10;index++){
            System.out.print(index+" ");
        }


        IntStream.range(0,10).forEach(index->System.out.print(index+" "));
        System.out.println();
        IntStream.rangeClosed(0,10).forEach(index->System.out.print(index+" "));

        int itemsPerPage = 10;
        int page=0;
        IntStream.range(page*itemsPerPage,page*itemsPerPage+itemsPerPage).forEach(index-> System.out.println(MockData.getCars().get(index)));
        */
        IntStream.iterate(50, value -> value - 5)
                .limit(10)
                .forEach(System.out::println);

        int startingNumber = 50;
        for (int counter = 0; counter < 10; counter++) {
            System.out.println(startingNumber);
            startingNumber -= 5;
        }
    }

    private static void howManyTimes() throws IOException {
        /*
        List<String> names = List.of(
                "zeev","amital","tal","ran","tal",
                "alon","tal","zeev"
        );
        Map<String,Long> map = names.stream()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));

        System.out.println(map);
        */
        Map<String, Long> map = MockData.getPepole().stream()
                .collect(Collectors.groupingBy(name -> name.getFirstName(), Collectors.counting()));
        //System.out.println(map);

    }

    private static void groupDemo() throws IOException {
        Map<String, List<Car>> map = MockData.getCars().stream()
                .collect(Collectors.groupingBy(Car::getMake));

        /*
        map.forEach((carType,cars)->{
            System.out.println("--------------------");
            System.out.println("car type: "+carType);
            System.out.println("--------------------");
            cars.forEach(System.out::println);
        });
        */
        map.get("MINI").forEach(System.out::println);
    }

    private static void streamDemo() {
        /*
        Stream.of(2,4,6,8,9,10,13)
                .filter(i->i%2==0)
                .forEach(myNum-> System.out.print(myNum+" "));

        Stream.of(2,4,6,8,9,10,13)
                .takeWhile(i->i%2==0)
                .forEach(myNum-> System.out.print(myNum+" "));


        int[] numbers = {1,2,3,4,5,6,7,8,9,10};
        int result = Arrays.stream(numbers).filter(n->n==9)
                .findAny()
                .orElse(-1);
        System.out.println(result);


        int[] even = {2,4,6,8,10,11};
        boolean allMatch = Arrays.stream(even).anyMatch(n->n%2==1);
        System.out.println(allMatch);


        List<Integer> numbers = List.of(7,9,5,3,2,7,9,3,4,4,4,1,2,9,8);
        Set<Integer> distinct = numbers.stream().collect(Collectors.toSet());
        System.out.println(distinct);

        List<Integer> numbers = List.of(7,9,5,3,2,7,9,3,4,4,4,1,2,9,8);
        List<Integer> distinct = numbers.stream().distinct().collect(Collectors.toList());
        System.out.println(distinct);
        */
    }

    private static void runPepoleFilter() throws IOException {
        List<Person> pepole = MockData.getPepole();
        /*
        List<Person> youngPepole = new ArrayList<>();
        //first 10 pepole under age 18
        int limit = 10;
        int counter = 0;
        for (Person person : pepole) {
            if (person.getAge()<=18){
                youngPepole.add(person);
                counter++;
                if (counter==limit){
                    break;
                }
            }
        }
        youngPepole.forEach(System.out::println);
        */

        Predicate<Person> getYoungPepole = p -> p.getAge() <= 18;
        Predicate<Person> getOldPepole = p -> p.getAge() >= 67;

        List<Person> youngPepole = pepole.stream()
                .filter(getOldPepole)
                .limit(10)
                .collect(Collectors.toList());
        youngPepole.forEach(System.out::println);
    }

    private static void runCarDemo() throws IOException {
        List<Car> cars = MockData.getCars();

        //shiri wants to buy a car, in color Fuscia , price under 20_000

        Predicate<Car> carPrice = c -> c.getPrice() < 20_000;
        Predicate<Car> carColor = c -> c.getColor().equals("Fuscia");

        List<Car> shiriCars = cars.stream()
                .filter(carPrice)
                .filter(carColor)
                .collect(Collectors.toList());

       // shiriCars.forEach(System.out::println);
        TablePrinter.print(shiriCars);


    }
}
