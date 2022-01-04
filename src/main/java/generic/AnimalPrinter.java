package generic;

public class AnimalPrinter<T extends Animal> {
    private T thingToPrint;

    public AnimalPrinter(T thingToPrint) {
        this.thingToPrint = thingToPrint;
    }

    public void showName(){
        System.out.println(this.thingToPrint.getName());
    }

    public void sound() {
        this.thingToPrint.makeSound();
    }

}
