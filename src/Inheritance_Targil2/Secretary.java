package Inheritance_Targil2;

public class Secretary extends Employee {
    protected int numberOfWords;

    protected Secretary(String name, int employeeID, float salary, int numberOfWords) {
        super(name, employeeID, salary);
        setBouns(500);
        this.setNumberOfWords(numberOfWords);
    }

    public int getNumberOfWords() {
        return numberOfWords;
    }

    public void setNumberOfWords(int numberOfWords) {
        this.numberOfWords = numberOfWords;
    }

    @Override
    protected float calcBouns() {
        //this.salary=this.salary+this.bouns;
        updateSalary(this.salary + this.bouns);
        return salary;
    }

    @Override
    public String toString() {
        return "Secretary{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                ", numberOfWords=" + numberOfWords +
                '}';
    }
}
