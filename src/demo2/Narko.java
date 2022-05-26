package demo2;

import java.util.Objects;

public class Narko implements FoodInfo,HealthInfo{
    private int id;
    private String name;
    private float weight;

    public Narko(){
        System.out.println("common drug abuser");
    }

    public Narko(String name, float weight){
        this.name=name;
        this.weight=weight;
        System.out.println("half man half narko");
    }

    public Narko(int id, String name, float weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
        System.out.println("Full CTOR");
    }

    @Override
    public void whatForDinner() {
        System.out.println("Space cake");
    }

    @Override
    public boolean smokingWeed() {
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Narko narko = (Narko) o;
        return id == narko.id && Float.compare(narko.weight, weight) == 0 && Objects.equals(name, narko.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, weight);
    }

    @Override
    public String toString() {
        return "Narko{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
