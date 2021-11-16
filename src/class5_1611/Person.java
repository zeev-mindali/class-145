package class5_1611;


public class Person {

    private String name;
    private int height;
    private int weight;

    /*
    public Person(String name, int height, int weight) {
        setName(name);
        setHeight(height);
        setWeight(weight);
    }
    */

    public Person(String name, int height, int weight) {
        this.name = name;
        this.height = height;
        this.weight = weight;
    }

    //Person(String,int)

    /*   VERY BAD EXAMPLE
    public Person(String name, int height){
        //bla bla
    }

    public Person(String name, int weight){
        //double bla bla
    }
    */

    public Person(String name) {
        setName(name);
        this.height = -1;
        this.weight = -1;
    }

    public Person(Person other) {
        name = other.name;
        weight = other.weight;
        height = other.height;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 30) {
            System.out.println("Please write a name and not a story");
            this.name = name.substring(0, 29);
        } else {
            this.name = name;
        }
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


//ein li bly => email : tal@hi.bye , 12345 (c'tor)
//ein li bly => email : tal@hi.bye , 54321 (setter/getter)