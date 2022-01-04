package generic;

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

       List<AnimalPrinter<Noiseable>> myAnimals = new ArrayList<>();
       myAnimals.add(new AnimalPrinter<>(new Dog("Nipo")));
       myAnimals.add(new AnimalPrinter<>(new Cat("Bumper")));
       myAnimals.add(new AnimalPrinter<>(new TV("LG")));
       for(AnimalPrinter item:myAnimals){
           item.showName();
       }

    }
}
