package generic;

public class Dog extends Animal implements Noiseable{
    public Dog(String name) {
        super(name);
    }


    @Override
    public void makeSound() {
        System.out.println("Hoooooo Hoooooooo");
    }
}
