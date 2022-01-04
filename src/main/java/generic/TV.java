package generic;

public class TV implements Noiseable{
    private String name;

    public TV(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public void makeSound() {
        System.out.println("Min irshalim el kutz");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}
