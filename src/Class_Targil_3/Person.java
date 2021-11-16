package Class_Targil_3;

public class Person {
    private String name;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String show() {
        return "Person name: " + getName() + "\n" +
                "Person Height: " + getHeight() + "\n" +
                "Person Weight: " + getWeight();
    }
}

// "fiat "+1+2+7 => fiat 127
// "fiat "+(1+2+7) => fiat 10
