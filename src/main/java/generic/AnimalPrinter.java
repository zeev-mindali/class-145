package generic;

public class AnimalPrinter<T extends Noiseable> {
    private T thingToPrint;

    public AnimalPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void showName() {
        this.thingToPrint.makeSound();
    }

}
