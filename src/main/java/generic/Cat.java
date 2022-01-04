package generic;

public class Cat extends Animal implements Noiseable {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Miouuuuu Chatuuuuula");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
