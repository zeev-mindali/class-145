package oop_exam_preperation.beans;

public class Employee extends Person{
    private Salary salary;

    public Employee(String name, int age, Salary salary) {
        super(name, age);
        this.salary = salary;
    }

    public Employee() {
        super();
        this.salary = new Salary();
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
}
