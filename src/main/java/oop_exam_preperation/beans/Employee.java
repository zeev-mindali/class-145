package oop_exam_preperation.beans;

import java.util.Arrays;

public class Employee extends Person{
    protected Salary salary;

    public Employee(String name, int age, Salary salary) {
        super(name, age);
        this.salary = salary;
        checkSalary();
    }



    public Employee() {
        super();
        this.salary = new Salary();
        checkSalary();
    }

    private void checkSalary(){
        if (this instanceof Manager && this.salary.getAmount()<25_000){
            this.salary.setAmount(25_000);
        }
    }

    public Salary getSalary() {
        return salary;
    }

    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
