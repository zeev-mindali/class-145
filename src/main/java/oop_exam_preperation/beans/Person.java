package oop_exam_preperation.beans;

import java.util.Random;

public class Person {
    protected String name;
    protected int age;
    protected String[] names = {"Zeev","Tal","Matan","Sean","Yair","Shiri", "Emanuel","Anna"
            ,"Daniel","Noam", "Huy", "Daniel", "Roei (hamekupach)"};

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        //create Random object
        Random rnd = new Random();
        //use method of nextInt to get random position for the array
        int randomPosition = rnd.nextInt(names.length); //0->names.length
        this.name = names[randomPosition];
        this.age = rnd.nextInt(41)+20; //(0->41)+20
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
