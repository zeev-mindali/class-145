package class6_1811;

public class Programmer extends Employee {
    //we have it on base class
    //private float bonus=1.5f;

    protected Programmer(String name, int employeeID, float salary) {
        super(name, employeeID, salary);
        setBouns(1.5f);
    }

    @Override
    protected float calcBouns() {
        //this.salary = this.salary*this.bouns;
        updateSalary(this.salary * this.bouns);
        return salary;
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + name + '\'' +
                ", employeeID=" + employeeID +
                ", salary=" + salary +
                '}';
    }
}
