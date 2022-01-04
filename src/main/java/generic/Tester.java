package generic;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Tester {
    public static void main(String[] args) {
        /*
        IntegerPrinter integerPrinter = new IntegerPrinter(23);
        integerPrinter.print();

        DoublePrinter doublePrinter = new DoublePrinter(65.23);
        doublePrinter.print();

        StringrPrinter stringrPrinter = new StringrPrinter("zeev");
        stringrPrinter.print();
        */
        /*
        Print<Integer> printInteger = new Print<>(23);
        Print<Double> printDouble = new Print<>(45.12);
        Print<String> printString = new Print<>("Nadav the king");
        printInteger.print();
        printDouble.print();
        printString.print();

        List<String> stam = new ArrayList<>();
        */
        /*
        AnimalPrinter<Dog> nipo = new AnimalPrinter<>(new Dog("Nipo"));
        AnimalPrinter<Dog> bumper = new AnimalPrinter<>(new Dog("Bumper"));
        //AnimalPrinter<TV> myLG = new AnimalPrinter<>(new TV("LG"));

       nipo.showName();
       bumper.showName();
       //myLG.showName();
       */

        /*
       List<AnimalPrinter<Noiseable>> myAnimals = new ArrayList<>();
       myAnimals.add(new AnimalPrinter<>(new Dog("Nipo")));
       myAnimals.add(new AnimalPrinter<>(new Cat("Bumper")));
       //myAnimals.add(new AnimalPrinter<>(new TV("LG")));
       for(AnimalPrinter item:myAnimals){
           item.sound();
       }
       */
        /*
        //zeev->zeev!!!
        //45->45!!!
        shout("ZEEV");
        shout(45);
        shout(3.1415);
        shout(true);

        shoutMe("I","Sheriff");
        shoutMe(new Dog("Nipo"),"Matan");
        shoutMe(45,new Cat("Bumper"));
        */

        List<Animal> myAnimal = new ArrayList<>();
        myAnimal.add(new Cat("Bumper"));
        myAnimal.add(new Dog("Nipo"));

        List<TV> myTV = new ArrayList<>();
        myTV.add(new TV("LG"));
        myTV.add(new TV("Samsung"));

        printList(myAnimal);
        System.out.println("=====================================");
        printList(myTV);
    }

    public static void printList_old(List<?> myList) {
        //myList.forEach(System.out::println);

    }

    public static void printList(List<? extends Noiseable> myList){
        for (Noiseable item:myList){
            item.makeSound();
        }
    }

    public static <T> void shout(T shotMe) {
        System.out.println(shotMe + "!!!");
    }

    public static <K, V> void shoutMe(K shot, V me) {
        System.out.println(shot + " shot " + me);
    }
}
