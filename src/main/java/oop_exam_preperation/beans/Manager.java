package oop_exam_preperation.beans;

import java.util.Arrays;

public class Manager extends Employee{
    public Manager(String name, int age, Salary salary) {
        super(name, age, salary);
    }

    public Manager(Employee employee){
        super(employee);
    }


    @Override
    public String toString() {
        return "Manager{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                "}\n";
    }
}
